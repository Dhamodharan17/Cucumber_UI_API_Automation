package stepdefinitionpackage;


import org.openqa.selenium.WebDriver;


import cucumber.TestContext;
import cucumber.api.java.en.*;
import pageObjects.FacebookLoginScreenPage;


public class FacebookLoginScreen {
	
	public  WebDriver driver;
	TestContext testContext;
	FacebookLoginScreenPage facebookLoginScreenPage;
	
	public FacebookLoginScreen(TestContext context) {
		testContext = context;
		// Creating Object for Pages in Steps -> calls pages constructor
		facebookLoginScreenPage = testContext.getPageObjectManager().getFacebookPage();
	}
	
	
	
	@Given("Launch Facebook on browser")
	public void launch_Facebook_on_browser() {		
		facebookLoginScreenPage.launchBrowser();
		
	}
	
	

	@Then("I want to enter username {string}")
	public void i_want_to_enter_username(String string) throws InterruptedException {	
		facebookLoginScreenPage.enterCredentials();
		
	}

	@When("I want to enter Password {string}")
	public void i_want_to_enter_Password(String string) {

	}

	@Then("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {	
		
		facebookLoginScreenPage.clickLogin();
	}

}
