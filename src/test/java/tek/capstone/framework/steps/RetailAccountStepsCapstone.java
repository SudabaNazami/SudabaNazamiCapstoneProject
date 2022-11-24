
package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactoryCapstone;
import tek.capstone.framework.pages.RetailAccountPageCapstone;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailAccountStepsCapstone extends CommonUtility{

	
	POMFactoryCapstone factoryCapstone = new POMFactoryCapstone();
	
	//Update Name,phone
	
	@When("User click on Account option")
	public void userClickOnAccountOption(){
	click(factoryCapstone.accountPageCapstone().AccountCapstone);	
	logger.info("user click on account option");
	
	}
	
	@And("User update Name {string} and Phone '{string}’")
	public void userUpdateNameAndPhone(String name, String phone){
	sendText(factoryCapstone.accountPageCapstone().nameCapstone,name);
	sendText(factoryCapstone.accountPageCapstone().phneNumberCapstone,phone);
	logger.info("user update name "+name+"and phone"+phone);
	
	}
	
	@And ("User click on Update button")
	public void userClickOnButton() {
	click(factoryCapstone.accountPageCapstone().updateCapstone);
	logger.info("user click on update button");
	
	}
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated(){
	Assert.assertTrue(isElementDisplayed(factoryCapstone.accountPageCapstone().AccountCapstone));
	logger.info("user profile information is update");
	
	}
	
	
	//Update password
	
	@And ("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
	List<Map<String,String>> UpdatePassword =data.asMaps(String.class,String.class) ;
	sendText(factoryCapstone.accountPageCapstone().previousPasswordCapstone,UpdatePassword.get(0).get("previousPassword"));
	sendText(factoryCapstone.accountPageCapstone().NewPasswordCapstone,UpdatePassword.get(0).get("newPassword"));
	sendText(factoryCapstone.accountPageCapstone().ConfirmPasswordCapstone,UpdatePassword.get(0).get("confirmPassword"));
	logger.info("user entered the informaion");
	slowDown();
	}
	
	
	@And ("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
	click(factoryCapstone.accountPageCapstone().ChangePasswordCapstone);
	logger.info("user click on change password button");
	}
	
	
	@Then ("you should see a massage {string}")
	public void youShouldSeeAMassage(String string){
	Assert.assertTrue(isElementDisplayed(factoryCapstone.accountPageCapstone().ChangePasswordCapstone));
	logger.info("a masssage should be displayed ");
	}
	
	
	
	
	//add payment method
	
	
	
	@And ("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	click(factoryCapstone.accountPageCapstone().PaymentMethodCapstone);
	logger.info("user click on add payment");
		
	}

	@And("User fill Debit or credit card information")
	public void userDebitOrCreditCardInformation(DataTable Data ) {
	List<Map<String,String>> payment = Data.asMaps(String.class,String.class);	
	sendText(factoryCapstone.accountPageCapstone().cardNumberCapstone,payment.get(0).get("cardNumber"));
	sendText(factoryCapstone.accountPageCapstone().CardNameCapstone,payment.get(0).get("nameOnCard"));
	selectByVisibleText(factoryCapstone.accountPageCapstone().expirationMonthCapstone, payment.get(0).get("expirationMonth"));
	selectByVisibleText(factoryCapstone.accountPageCapstone().expirationYearCapstone,payment.get(0).get("expirationYear"));
	sendText(factoryCapstone.accountPageCapstone().securityCode,payment.get(0).get("securityCode"));
	logger.info("userDebitOrCreditCardInformation");
	}
	
	@And ("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	click(factoryCapstone.accountPageCapstone().submitcartCapstone);
	logger.info("user submit the cart information");
	}
	
	@Then("message should be showen {string}")
	public void aMessageShouldBeDisplayed(String string) {
		String expect = string;
        String actual =getElementText(factoryCapstone.accountPageCapstone().massagePayment);
        Assert.assertEquals(actual, expect);
        logger.info("Payment Method added sucessfully");
	
	}
	
	
	
	
	//Edit payment method
	
	@And ("user click on last payment")
	public void userClickOnLastPayment() {
	click(factoryCapstone.accountPageCapstone().LastPayment);

	}


	@And ("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	click(factoryCapstone.accountPageCapstone().PaymentMethod2Capstone);
	logger.info("user click on add payment");
	
	}

	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable Data ) {
	List<Map<String,String>> payment = Data.asMaps(String.class,String.class);
	
	clearText(factoryCapstone.accountPageCapstone().cardNumberCapstone);
	sendText(factoryCapstone.accountPageCapstone().cardNumberCapstone,payment.get(0).get("cardNumber"));
	
	clearText(factoryCapstone.accountPageCapstone().CardNameCapstone);
	sendText(factoryCapstone.accountPageCapstone().CardNameCapstone,payment.get(0).get("nameOnCard"));
	
	selectByVisibleText(factoryCapstone.accountPageCapstone().expirationMonthCapstone, payment.get(0).get("expirationMonth"));
	
	selectByVisibleText(factoryCapstone.accountPageCapstone().expirationYearCapstone,payment.get(0).get("expirationYear"));
	
	clearText(factoryCapstone.accountPageCapstone().securityCode);
	sendText(factoryCapstone.accountPageCapstone().securityCode,payment.get(0).get("securityCode"));
	
	logger.info("userDebitOrCreditCardInformation");
	}
	
	
	@And ("user click on Update Edit Your Card button")
	public void userClickOnUpdateEditYourCardButton() {
	click(factoryCapstone.accountPageCapstone().submitcartEdit);
	logger.info("user submit the cart information");
	}
	
	@Then("message should be display {string}")
	public void massageShouldBeDisplayEditedSuccesfully(String Str) {
		String actual = "Payment Method updated Successfully";
		String expect = getElementText(factoryCapstone.accountPageCapstone().EditPaymentMassage);
	    Assert.assertEquals(actual, expect);
	    logger.info("Message was displayed successfully");
	}
	
	
	//RemovePaymentMethod
	
	
	
	@And ("User click on remove option of card section")
	public void userClickOnRemoveOptionOfVardSection() {
	click(factoryCapstone.accountPageCapstone().RemovePaymentCapstone);
	logger.info("user removed the payment");
   	
	}
	
	@Then ("payment details should be removed")
	public void paymentDetailsShouldbeRemoved() {
	Assert.assertTrue(isElementDisplayed(factoryCapstone.accountPageCapstone().RemovePaymentCapstone));	
	logger.info("payment details should be remove");
	}
	
	
	
	//Add Address
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
	click(factoryCapstone.accountPageCapstone().Addaddress);
	logger.info("Add an Address");
		
	}
	
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable Data3) {
	List<Map<String,String>> Address1 = Data3.asMaps(String.class,String.class);
	selectByVisibleText(factoryCapstone.accountPageCapstone().addCountry,Address1.get(0).get("country"));
	sendText(factoryCapstone.accountPageCapstone().NameLastNameAdredd,Address1.get(0).get("fullName"));
	sendText(factoryCapstone.accountPageCapstone().phoneNumberAddress,Address1.get(0).get("phoneNumber"));
	sendText(factoryCapstone.accountPageCapstone().AddressStreet,Address1.get(0).get("streetAddress"));
	sendText(factoryCapstone.accountPageCapstone().AddressAppartment,Address1.get(0).get("apt"));
	sendText(factoryCapstone.accountPageCapstone().AddCityAddress,Address1.get(0).get("city"));
	selectByVisibleText(factoryCapstone.accountPageCapstone().state,Address1.get(0).get("state"));
	sendText(factoryCapstone.accountPageCapstone().ZipCodeAddress,Address1.get(0).get("zipCode"));
	logger.info("address information");
	
	}
	
	@And ("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	click(factoryCapstone.accountPageCapstone().AddressSubmit);
	logger.info("Add a contry");
	}
	@Then ("a message should be displayed {string}")
	public void aMassageShouldBeDisplayedAddressAdded(String str) {
		String expect = str;
        String actual =getElementText(factoryCapstone.accountPageCapstone().UpdateYourAddress);
        Assert.assertEquals(actual, expect);
        logger.info("the message was displayed");
		
	}
	
	
	//EditAddress
	
	
	
	
	@And ("User click on edit address option")
	public void userClickOnEditAddressOption(){
	click(factoryCapstone.accountPageCapstone().EditAddress);
	logger.info("Edit Address");
	}

	@And ("User edit new address with below information")
	public void userEditNewAddress(DataTable Data) {
	List<Map<String,String>> Address1 = Data.asMaps(String.class,String.class);
	
	selectByVisibleText(factoryCapstone.accountPageCapstone().addCountry,Address1.get(0).get("country"));
	
	clearText(factoryCapstone.accountPageCapstone().NameLastNameAdredd);
	sendText(factoryCapstone.accountPageCapstone().NameLastNameAdredd,Address1.get(0).get("fullName"));
	
	clearText(factoryCapstone.accountPageCapstone().phoneNumberAddress);
	sendText(factoryCapstone.accountPageCapstone().phoneNumberAddress,Address1.get(0).get("phoneNumber"));
	
	clearText(factoryCapstone.accountPageCapstone().AddressStreet);
	sendText(factoryCapstone.accountPageCapstone().AddressStreet,Address1.get(0).get("streetAddress"));
	
	clearText(factoryCapstone.accountPageCapstone().AddressAppartment);
	sendText(factoryCapstone.accountPageCapstone().AddressAppartment,Address1.get(0).get("apt"));
	
	clearText(factoryCapstone.accountPageCapstone().AddCityAddress);
	sendText(factoryCapstone.accountPageCapstone().AddCityAddress,Address1.get(0).get("city"));
	
	selectByVisibleText(factoryCapstone.accountPageCapstone().state,Address1.get(0).get("state"));
	
	clearText(factoryCapstone.accountPageCapstone().ZipCodeAddress);
	sendText(factoryCapstone.accountPageCapstone().ZipCodeAddress,Address1.get(0).get("zipCode"));
	
	click(factoryCapstone.accountPageCapstone().AddressSubmit);
	logger.info("address information");
	
	}
	
	@And ("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	click(factoryCapstone.accountPageCapstone().EditAddress);
	logger.info("Add a contry");
	}
	@Then ("a message should be displayed 'Address Updated Successfully'")
	public void aMassageShouldBeDisplayedAddressAdded() {
	Assert.assertTrue(isElementDisplayed(factoryCapstone.accountPageCapstone().MassageEditAddress));
	logger.info("Address added ");
		
	}
	
	
	//Remove Address
	
	@And ("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	click(factoryCapstone.accountPageCapstone().RemoveAddressCapstone);	
	logger.info("remove the address successfully");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved(){
	Assert.assertTrue(isElementDisplayed(factoryCapstone.accountPageCapstone().RemoveAddressCapstone));	
	logger.info("Address Removed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}