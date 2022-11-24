Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'StudentTEK@gmail.com' and password 'Tekschool@123'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @UpdateNameCapstone
  Scenario: Verify User can update Profile Information
    And User update Name 'Sudaba' and Phone '"916 777 444"’
    And User click on Update button
    Then user profile information should be updated

  @UpdatePasswordCapstone
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek123@123       | Sudaba123@  | Sudaba123@      |
    And User click on Change Password button
    Then you should see a massage 'Password Updated Successfully'

  @AddpaymentMethodCapstone
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9065798989456564 | TEK        |              12 |           2024 |          783 |
    And User click on Add your card button
    Then message should be showen 'Payment Method added sucessfully'

  @EditPaymentMethod
  Scenario: Verify User can edit Debit or Credit card
    And user click on last payment
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6836538790093618 | TekKet     |              11 |           2025 |          902 |
    And user click on Update Edit Your Card button
    Then message should be display 'Payment Method updated Successfully'

  
  @Removepayment
  Scenario: Verify User can remove Debit or Credit card
    And user click on last payment
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddres
  Scenario: Verify User can add an Address
    And User click on Add address option
    Then User fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress | apt | city       | state  | zipCode |
      | United States | School   | 916 666 5550 | 7895 Mall Ave | 908 | sacramento | Alaska |   99873 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  
  @EditAddress
  Scenario: Verify User can edit the Address
    And User click on edit address option
    And User edit new address with below information
      | country | fullName  | phoneNumber  | streetAddress  | apt | city     | state | zipCode |
      | Turkey  | Tom jerry | 916 888 9999 | 980 Street Ave | 345 | SanRamon | Adana |   56432 |
    And a massage shoild be showen 'Address Updated Successfully'

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
