package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import testCases.BaseClass;
import wrapper.GenericWrapper;

public class DashboardPage extends BaseClass {
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Info']")
	WebElement myInfoMenu;
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminMenu;
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement leaveMenu;
	
	@FindBy(xpath="//span[text()='Recruitment']")
	WebElement recruitmentMenu;

	public void validateDashboardMenus() {
		try {
			GenericWrapper.waitUntillVisibility(myInfoMenu);	
			Assert.assertTrue(myInfoMenu.isDisplayed());
			Assert.assertTrue(adminMenu.isDisplayed());
			Assert.assertTrue(leaveMenu.isDisplayed());
			Assert.assertTrue(recruitmentMenu.isDisplayed());
			test.log(Status.PASS, "All the Menu's validated");
		} catch (Exception e) {
			System.out.println("Some of the Menu's are not available or thrown some error");
			test.log(Status.FAIL, "Validations failed for dashboard menu");
		} finally {
			// screenshot
			// report / log
		}

	}
	
	public void clickOnMyInfo() {
		try {
			myInfoMenu.click();
			test.log(Status.PASS, "Clicked My Info");
			test.addScreenCaptureFromPath("C:\\Users\\bhara\\FrameworkBatch42\\automation\\src\\test\\resources\\testDatas\\sdlc.png");
		} catch (Exception e) {
			System.out.println("Unable to click the My Info Menu");
			test.log(Status.FAIL, "Unable to click the my info");
		}
		finally {
			//screentshot, report, log
		}
	}

}
