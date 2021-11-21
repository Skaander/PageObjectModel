package OrangeSteps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helpers.Controller;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeStepDefinitons {

	WebDriver driver;
	Controller Login;

	@Given("^I access to Orange  login site$")

	public void i_access_to_orange_login_site() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();
	}

	@And("^I enter \"([^\"]*)\"$")
	public void i_enter_something(String username) throws Throwable {

		Login = new Controller(driver);

		Login.enterUsername(username);
	}

	@And("^I enter my \"([^\"]*)\"$")
	public void i_enter_my_something(String password) throws Throwable {

		Login.enterPassword(password);

	}

	@When("^I hit on the login CTA$")
	public void i_hit_on_the_login_cta() throws Throwable {

		Login.clickSubmit();
	}

	@Then("^I want to land on my Homepage$")
	public void i_want_to_land_on_my_homepage() throws Throwable {

		String ExpectedTitle = driver.findElement(By.xpath("//b[normalize-space()='Dashboard']")).getText();

		String ActualTitye = "Dashboard";

		Assert.assertEquals(ExpectedTitle, ActualTitye);

	}

}
