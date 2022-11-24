package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePageCapstone extends BaseSetup {

	public RetailHomePageCapstone() {
		PageFactory.initElements(getDriver(), this);

	}
	
	
	//ShopBy 2
	
	@FindBy(xpath="//button[@id='hamburgerBtn']")
    public WebElement All;
    
    @FindBy(id = "signinLink")
    public  WebElement signin ;
    
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    
    @FindBy(id="accountLink")
    public WebElement account1;
    
    @FindBy(id="newAccountBtn")
    public WebElement CreateAccount;
    
    @FindBy(xpath="//span[text()='Electronics']")
    public WebElement electronics;
    
     @FindBy(xpath="//span[text()='Computers']")
    public WebElement computer;
    
    @FindBy(xpath="//span[text()='Smart Home']")
    public WebElement smarthome;
    
    @FindBy(xpath="//span[text()='Sports']")
    public WebElement Sports;
    
    @FindBy(xpath="//span[text()='Automative']")
    public WebElement Automative;
    
     @FindBy(xpath="//span[text()='TV & Video']")
    public WebElement TvAndVideo;
    
    @FindBy(xpath="//span[text()='Video Games']")
    public WebElement VideoGames;
    
    @FindBy(xpath="//span[text()='Accessories']")
    public WebElement Accessories;
    
    @FindBy(xpath="//span[text()='Networking']")
    public WebElement Networking;
    
    @FindBy(xpath="//span[text()=\"Smart Home Lightning\"]")
    public WebElement smarthomelight;

    @FindBy(xpath="//span[text()=\"Plugs and Outlets\"]")
    public WebElement plag;

     @FindBy(xpath="//span[text()='Athletic Clothing']")
    public WebElement AthleticClothing;
    
    @FindBy(xpath="//span[text()='Exercise & Fitness']")
    public WebElement ExerciseFitness;
    
    @FindBy(xpath="//span[text()='Automative Parts & Accessories']")
    public WebElement AutomativePartsAccessories;
    
    @FindBy(xpath="//span[text()='MotorCycle & Powersports']")
    public WebElement MotorCyclePowersports;
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	//@AddtoCart
	
	@FindBy(xpath ="//select[@id='search']")
	public WebElement AllDepartment;
	

	@FindBy(xpath = "//input[@id='searchInput']")
	public WebElement searchInput;
	

	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement SerchBtn;
	

	@FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement  itemCapstone;
	

	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement ItemCountCapstone;
	

	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement AddToCartCapstone;
	
	
	@FindBy(id="cartQuantity")
	public WebElement CartQty;
	
	
	//place Order
	
	@FindBy(xpath="//div[@id='cartBtn']")
	public WebElement CartOption;
	
	@FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement ProcedCheckout;
	
	@FindBy(xpath="//button[@id='addAddressBtn']")
	public WebElement addNewAddress;
	
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement AddNewPayment;
	
	
	@FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement palceOrder;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[3]/div/div/div[1]/p")
	public WebElement NewMassage;
	
	
	
	//Place Order 2
	
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[3]/div/div/p[1]")
	public WebElement ApexCoins;
	
	
	
	
	
	
	
	
}


































