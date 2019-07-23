package CUC99.CUC100;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demotourslogin {
	
	WebDriver driver;
	
	@Given("^Apllication URL$")
	public void apllication_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}





	@Given("^I want to enter the username a step with name(\\d+)$")
	public void i_want_to_enter_the_username_a_step_with_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(arg1);
	}

	@And("^I want to enter the password a step with (\\d+)$")
	public void i_want_to_enter_the_username_a_step_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(arg1);
		
	}

	@When("^details are enterred$")
	public void details_are_enterred() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		System.out.println("running with the demos for the github");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		}

	@Then("^I will click on the login button$")
	public void i_will_click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		driver.close();
	}

}
