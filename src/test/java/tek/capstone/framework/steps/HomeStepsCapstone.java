package tek.capstone.framework.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactoryCapstone;
import tek.capstone.framework.utilities.CommonUtility;

public class HomeStepsCapstone extends CommonUtility{
	
	POMFactoryCapstone factoryCapstone = new POMFactoryCapstone();
	
	

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
	String actualTitle = getTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +" is equal to "+ expectedTitle);
	}
	
	//ShopBy1
	
	@When("User click on All section")
	public void userClickOnAllSection() {
    click(factoryCapstone.HomePageCapstone().All);
	logger.info("click on all section");
	slowDown();
	}
	

	@Then("below options are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
        List<List<String>> optionsToDisplay = options.asLists(String.class);
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']" ))));
               logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
	}
	

	
	
	//ShopBy2
	
	
	
	  String department;



	   @When("User on {string}")
	    
	    public String userOnElectronics(String department) {



	       switch (department) {
	        case "Electronics":
	            Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().electronics));
	            logger.info("user is on Electronics section");
	            break;
	            
	        case "Computers":
	            Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().computer));
	            logger.info("user is on Computers section");
	            break;
	            
	        case "SmartHome":
	            Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().smarthome));
	            logger.info("user is on Computers section");
	            break;
	            
	            
	        case "Sports":
	            Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().Sports));
	            logger.info("user is on Sports section");
	            break;
	            
	        case "Automotive":
	            Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().Automative));
	            logger.info("user is on Automotive section");
	            break;
	        default:

	       }
	       return this.department = department;
	   }

	   

	   @Then("below options are present in department")
	    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	        List<List<String>> department = dataTable.asLists();



	       switch (this.department) {
	        case "Electronics":
	            clickElementWithJS(factoryCapstone.HomePageCapstone().electronics);
	            String video = getText(factoryCapstone.HomePageCapstone().VideoGames);
	            String TVVideo = getText(factoryCapstone.HomePageCapstone().TvAndVideo);
	            Assert.assertEquals(TVVideo, department.get(0).get(0));
	            Assert.assertEquals(video, department.get(0).get(1));
	            logger.info(video + " options are present in department" + TVVideo);
	            break;
	        case "Computers":
	            clickElementWithJS(factoryCapstone.HomePageCapstone().computer);
	            String Accessories = getText(factoryCapstone.HomePageCapstone().Accessories);
	            String Networking = getText(factoryCapstone.HomePageCapstone().Networking);
	            Assert.assertEquals(Accessories, department.get(0).get(0));
	            Assert.assertEquals(Networking, department.get(0).get(1));
	            logger.info(Accessories + " options are present in department" + Networking);
	            break;
	            
	        case "SmartHome":
	            click(factoryCapstone.HomePageCapstone().smarthome);
	            String SmartHomeLightning = getText(factoryCapstone.HomePageCapstone().smarthomelight);
	            String PlugsandOutlets = getText(factoryCapstone.HomePageCapstone().plag);
	            Assert.assertEquals(SmartHomeLightning, department.get(0).get(0));
	            Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));
	            logger.info(SmartHomeLightning + " options are present in department" + PlugsandOutlets);
	            break;
	        case "Sports":
	            clickElementWithJS(factoryCapstone.HomePageCapstone().Sports);
	            String AthleticClothing = getText(factoryCapstone.HomePageCapstone().AthleticClothing);
	            String ExerciseFitness = getText(factoryCapstone.HomePageCapstone().ExerciseFitness);
	            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
	            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
	            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
	            break;
	        case "Automotive":
	            clickElementWithJS(factoryCapstone.HomePageCapstone().Automative);
	            String AutomativePartsAccessories = getText(factoryCapstone.HomePageCapstone().AutomativePartsAccessories);
	            String MotorCyclePowersports = getText(factoryCapstone.HomePageCapstone().MotorCyclePowersports);
	            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
	            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
	            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
	            break;



	       }



	   }
	
	
	//Add to Cart
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome){
	selectByVisibleText(factoryCapstone.HomePageCapstone().AllDepartment,smartHome);
	logger.info("select smart home");
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItem(String Text) {
	sendText(factoryCapstone.HomePageCapstone().searchInput,Text);
	logger.info("search some thing");
	}
	
	@And ("User click on Search icon")
	public void userClickOnSerchIcone() {
	click(factoryCapstone.HomePageCapstone().SerchBtn);
	logger.info("click on search");
	}
	
	
	@And("User click on item")
	public void userClickOnItem() {
	click(factoryCapstone.HomePageCapstone().itemCapstone);
	logger.info("item add ");	
	}
	
	@And ("User select quantity {string}")
	public void userSelectQuantity(String count) {
	selectByVisibleText(factoryCapstone.HomePageCapstone().ItemCountCapstone,count);
	logger.info("item count added");
	}
	
	
	@And ("User click add to Cart button")
	public void userClickAddToCartButton() {
	click(factoryCapstone.HomePageCapstone().AddToCartCapstone);
	logger.info("item added to cart");	
	}
	
	@Then ("the cart icon quantity should change to {string}")
	public void theCartIconeQuantityShouldChange(String Qty) {
	Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().CartQty));	
	logger.info	("item added to cart successfully");
	}
	
	
	//PlaceOrder
	
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
	click(factoryCapstone.HomePageCapstone().CartOption);   
		
		
	}
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	click(factoryCapstone.HomePageCapstone().ProcedCheckout);    
	
		
	}
	@And ("User click Add Your  new Address")
	public void userClickAddYourNewAddres() {
	click(factoryCapstone.HomePageCapstone().addNewAddress);
	logger.info("add Address");
	
	}
	@And("User click on add new payment")
	public void userClickOnAddNewPayment() {
	click(factoryCapstone.HomePageCapstone().AddNewPayment);
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	click(factoryCapstone.HomePageCapstone().palceOrder);    
		
	}
	@Then("there is a massage {string}")
	public void thereIsAMassage(String Massage) {
	Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().NewMassage));    
	}


	
	//Place order2
	
	
	@And ("User click on secound Item")
	public void userClickOnSecoundItem() {
	click(factoryCapstone.HomePageCapstone().ApexCoins);
	logger.info("secound item added");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


