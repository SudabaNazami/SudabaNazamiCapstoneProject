package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPageCapstone extends BaseSetup{
	
	public RetailAccountPageCapstone() {
		PageFactory.initElements(getDriver(),this);
		
	}	

	//Update Name,phone

	@FindBy(id = "accountLink")
	public WebElement AccountCapstone;
		
		
	@FindBy(xpath = "//input[@id ='nameInput']")
	public WebElement nameCapstone;
		
	@FindBy(xpath ="//input[@id ='personalPhoneInput']")
	public WebElement phneNumberCapstone;
		
	@FindBy (xpath = "//button[text() ='Update']")	
	public WebElement updateCapstone;


	//Update password

	@FindBy(xpath ="//input[@name='previousPassword']")
	public WebElement previousPasswordCapstone;

	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement NewPasswordCapstone;

	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement ConfirmPasswordCapstone;

	@FindBy(xpath="//button[text()=\"Change Password\"]")
	public WebElement ChangePasswordCapstone;



	//add payment method


	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement PaymentMethodCapstone;

	@FindBy(xpath = "//input[@id ='cardNumberInput']")
	public WebElement cardNumberCapstone;	
	
	@FindBy(xpath ="//input[@id ='nameOnCardInput']")
	public WebElement CardNameCapstone;
	
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement  expirationMonthCapstone;
	
	@FindBy(xpath ="//select[@id ='expirationYearInput']")
	public WebElement expirationYearCapstone;
	
	@FindBy(xpath="//input[@id ='securityCodeInput']")
	public WebElement securityCode;
	
	
	@FindBy(xpath = "//button[@id ='paymentSubmitBtn']")
	public WebElement submitcartCapstone;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement massagePayment;
	
	
	
	//EditPaymentMethod
	
	
	@FindBy(xpath="//div[@class='account__payment-image-wrapper']//child::img[@alt='Master Card']")
	public WebElement LastPayment;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
	public WebElement PaymentMethod2Capstone;
	
	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement submitcartEdit;
	
	@FindBy(xpath= "//div[text()='Payment Method updated Successfully']")
	public WebElement EditPaymentMassage;
	
	
	
	

	//Remove payment
	
	
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement RemovePaymentCapstone;
	
	
	

     //@AddAdress
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement Addaddress;
	
	@FindBy(xpath= "//select[@id='countryDropdown']")
	public WebElement addCountry;
	
	@FindBy(xpath ="//input[@id='fullNameInput']")
	public WebElement NameLastNameAdredd;
	
	@FindBy(xpath ="//input[@id='phoneNumberInput']")
	public WebElement phoneNumberAddress;
	
	@FindBy(xpath ="//input[@id='streetInput']")
	public WebElement AddressStreet;
	
	@FindBy(xpath ="//input[@id='apartmentInput']")
	public WebElement AddressAppartment;
	
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement AddCityAddress;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement state;
	
	@FindBy(xpath ="//input[@id = 'zipCodeInput']")
	public WebElement ZipCodeAddress;
	
	@FindBy(xpath ="//button[@id = 'addressBtn']")
	public WebElement AddressSubmit;
	
	@FindBy(xpath= "//div[text()='Address Added Successfully']")
	public WebElement UpdateYourAddress;
	
	
	
	//Edit Address
	
	
	
	
	
	
	
    @FindBy(xpath = "//button[text()='Edit']")
    public WebElement EditAddress;
		
    @FindBy(xpath="//button[text()='Update Your Address']")
	public WebElement updateAddressButton;
    
    @FindBy(xpath= "//div[text()='Address Updated Successfully']")
    public WebElement MassageEditAddress;
	
	
    
    
	//Remove Address
    
    @FindBy(xpath = "//button[text()='remove']")
    public WebElement RemoveAddressCapstone;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
