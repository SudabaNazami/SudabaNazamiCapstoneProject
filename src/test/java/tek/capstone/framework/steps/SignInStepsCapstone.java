package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactoryCapstone;
import tek.capstone.framework.utilities.CommonUtility;


	public class SignInStepsCapstone extends CommonUtility {
		
		POMFactoryCapstone factoryCapstone = new POMFactoryCapstone();
		
		
		//Sign in
		
		@When("User click on Sign in option")
		public void userClickOnSignInOption() {
			click(factoryCapstone.HomePageCapstone().signin);
			logger.info("user clicked on Sign In option");
		}
		
		@And("User enter email {string} and password {string}")
		public void userEnterEmailAndPassword(String email,String password) {
			sendText(factoryCapstone.signInPageCapstone().emailField,email);
			sendText(factoryCapstone.signInPageCapstone().passwordField,password);
			logger.info("user entered email "+ email + " and password "+ password);
		
			
		}
		
		@And("User click on login button")
		public void userClickOnLoginButton() {
			click(factoryCapstone.signInPageCapstone().loginButton);
			logger.info("user clicked on login button");
		}
		
		@Then("User should be logged in into Account")
		public void userShouldBeLoggedInIntoAccount() {
			Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().account1));
			logger.info("user logged in into account");
			
			
		}
		
		//Create Account 
		
		@And("User click on Create New Account button")
		public void userClickOnCreateNewAccountButton() {
			click(factoryCapstone.signInPageCapstone().newAccountButton);
			logger.info("user clicked on Create New Account button");
			
		}
		
		
		@And("User fill the signUp information with below data")
		public void userFillTheSignUpInformationWithBelowData(DataTable data) {
			List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
			sendText(factoryCapstone.signInPageCapstone().nameInput,signUpData.get(0).get("name"));
			sendText(factoryCapstone.signInPageCapstone().emailInput,signUpData.get(0).get("email"));
			sendText(factoryCapstone.signInPageCapstone().passwordInput,signUpData.get(0).get("password"));
			sendText(factoryCapstone.signInPageCapstone().confirmPasswordInput,signUpData.get(0).get("confirmPassword"));
			logger.info("user entered required information into sign up form");
			
			
		}
		
		@And("User click on SignUp button")
		public void userClickOnSignUpButton() {
			click(factoryCapstone.signInPageCapstone().signUpButton);
			logger.info("user clicked on Sign up Button");
			
		}
		
		@Then("User should be logged into account page")
		public void userShouldBeLoggedIntoAccountPage() {
			Assert.assertTrue(isElementDisplayed(factoryCapstone.HomePageCapstone().account1));
			logger.info("Account was created");
			slowDown();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
