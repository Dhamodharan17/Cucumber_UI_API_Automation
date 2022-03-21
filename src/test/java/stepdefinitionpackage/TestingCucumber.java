package stepdefinitionpackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class TestingCucumber {

	@Given("I want to  jhon application")
	public void i_want_to_jhon_application() {
		System.out.println("step 1");
	}

	@When("I check for the {int} in application screen")
	public void i_check_for_the_in_application_screen(Integer int1) {
		System.out.println(int1);  
	}

	@Then("I verify the success in application")
	public void i_verify_the_success_in_application() {
		System.out.println("step 2");
	}

	@Given("I want to  berlin application")
	public void i_want_to_berlin_application() {
		System.out.println("step 3");
	}

	@Then("I verify the Fail in application")
	public void i_verify_the_Fail_in_application() {
		System.out.println("step 4");  
	}
	@Before("@BookHotel")           //hooks in cucumber
	public void beforeScenario() {
		System.out.println("------------------------Before Executing-----------------------------");
	}
	
	@After("@BookHotel")         //hooks in cucumber
	public void afterScenario() {
		System.out.println("---------------------After Executing----------------------------------");
	}
}
