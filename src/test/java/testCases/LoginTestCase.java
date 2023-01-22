package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void enterCredentialsAndLogin() throws Throwable {
		LoginPage lp=new LoginPage();
		lp.validateTheLoginPageTitle();
		lp.login();
	}
	
}
