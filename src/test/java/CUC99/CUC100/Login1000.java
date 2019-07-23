package CUC99.CUC100;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login1000 {
	WebDriver driver;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	   System.out.println("i_want_to_write_a_step_with_precondition");
	   driver.get("http://newtours.demoaut.com/");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		System.out.println("some_other_precondition");   
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		System.out.println("some_other_precondition");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
		System.out.println("some_other_precondition");
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
		System.out.println("some_other_precondition");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		System.out.println("some_other_precondition");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		System.out.println("some_other_precondition");
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
		System.out.println("some_other_precondition");  
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
		System.out.println("some_other_precondition"); 
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
		System.out.println("some_other_precondition"); 
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
		System.out.println("some_other_precondition"); 
	}
}
