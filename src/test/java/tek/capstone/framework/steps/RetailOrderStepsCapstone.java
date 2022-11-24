package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactoryCapstone;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderStepsCapstone extends CommonUtility{
	
	POMFactoryCapstone factoryCapstone = new POMFactoryCapstone();

//CancelOrder

@And ("User click on Orders section")
public void userClickOnOrdersSection() {
}

@And ("User click on first order in list")
public void userClickOnFirstOrderInList() {
click(factoryCapstone.orderPageCapstone().Orderbutton);	
logger.info("click on order");
}

@And ("User click on Cancel The Order button")
public void userClickOnCancelTheOrderButton(){
click(factoryCapstone.orderPageCapstone().cancelbuttom);
logger.info("click on cancel");
}

@And ("User select the cancelation Reason {string}")
public void userSelectTheCancelationReason(String resone){
selectByVisibleText(factoryCapstone.orderPageCapstone().cancelReson,resone);
logger.info("choose the resone");
}
	
@And ("User click on Cancel button")
public void userClickOnCancelButton(){
click(factoryCapstone.orderPageCapstone().CancelOrder);	
logger.info("ordercancelled");
}
	
@Then ("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
public void aCancelationMassageShouldBeDisplayed() {
Assert.assertTrue(isElementDisplayed(factoryCapstone.orderPageCapstone().CancelOrder));	
logger.info("order canceled successfully");
}
	
	
	
//ReturnOrder	
	

@And("User click on Return Items button")
public void userClickOnReturnItemsButton() {
click(factoryCapstone.orderPageCapstone().returnOption);
logger.info("click on return ");
}
@And ("User select the Return Reason {string}")
public void userSelectTheReturnReasonItemDamaged(String resone) {
selectByVisibleText(factoryCapstone.orderPageCapstone().resoneReturnCapstone,resone); 
logger.info(" Choose return resone");
}
@And("User select the drop off service {string}")
public void userSelectTheDropOffServiceFedEx(String DropOf) {
selectByVisibleText(factoryCapstone.orderPageCapstone().dropOffInput,DropOf);
logger.info("choose drop of location");
}

@And("User click on Return Order button")
public void userClickOnReturnOrderButton() {
click(factoryCapstone.orderPageCapstone().returnButton);
logger.info("item returned");
}

@Then("a cancelation message should be displayed {string}")
public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String str) {
	String expect = str;
    String actual =getElementText(factoryCapstone.orderPageCapstone().retutnOrderMessage);
    Assert.assertEquals(actual, expect);
    logger.info("the message was displayed");}   
	
	
	
//ReviewButtonCapstone	
	
	
@When ("User click on Review button")
public void userClickOnReviowButton() {
click(factoryCapstone.orderPageCapstone().Review);
logger.info("add Review");
}
	
@And("User write Review headline 'secound’ and text  'I like this item'")
public void userWriteReviewHeadlineSecoundAndTextILikeThisItem() {
getText(factoryCapstone.orderPageCapstone().Headlin);
getText(factoryCapstone.orderPageCapstone().TextArea);
logger.info("user review the order");
}
 
@And ("User click Add your Review button")
public void userClickAddYourReviowButton() {
click(factoryCapstone.orderPageCapstone().AddReview);
logger.info("click on add review");
}

@Then("a review message should be displayed ‘Your review was added successfully’")
public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
Assert.assertTrue(isElementDisplayed(factoryCapstone.orderPageCapstone().Review));
logger.info("revioew Successfully");
}
	
	
	
	
	
}