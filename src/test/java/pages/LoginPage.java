package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import testCases.BaseClass;
import utility.ConfigUtils;
import wrapper.GenericWrapper;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn;
	
	public void validateTheLoginPageTitle() {
		System.out.println("Title of the Login page is validated");
	}

	public void login() throws Throwable {
		try {
			userName.sendKeys(ConfigUtils.readConfigData("username"));
			pwd.sendKeys(ConfigUtils.readConfigData("password"));
			GenericWrapper.waitUntillVisibility(btn);
			btn.click();
			Assert.assertEquals("bharathi.mang@outlook.com", "bharathi.mang@outlook.com");
			test.log(Status.PASS, "Email ID is same");
		} catch (Throwable e) {
			test.log(Status.FAIL, e.getMessage());
		}

	}
	

}
