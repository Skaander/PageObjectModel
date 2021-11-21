package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Controller {

	@FindBy(id = "txtUsername")

	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement LoginCTA;

	public WebDriver driver;

	public Controller(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String Username) {

		username.sendKeys(Username);
	}

	public void enterPassword(String Password) {

		password.sendKeys(Password);

	}

	public void clickSubmit() {

		LoginCTA.click();
	}

	public void loginToTheApp(String Username, String Password) {
		this.enterUsername(Username);
		this.enterPassword(Password);
		this.clickSubmit();

	}

}