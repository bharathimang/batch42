package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import testCases.BaseClass;
import wrapper.GenericWrapper;

public class MyInformationPage extends BaseClass {
	
	public MyInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='middleName']")
	WebElement middleName;
	
	@FindBy(xpath="//label[text()='Nationality']//following::i[1]")
	WebElement drpNationality;
	
	@FindBy(xpath="//label[text()='Nationality']//following::div[2]")
	WebElement drpNationalityList;
	
	public void modifyPersonalDetails() {
		
		drpNationality.click();
		System.out.println(drpNationalityList.isDisplayed());
		
		List<WebElement> ls=driver.findElements(By.xpath("//label[text()='Nationality']//following::div[@role='listbox']//div"));
		System.out.println(ls.size());
		
		for(WebElement ele:ls) {
			System.out.println(ele.getText());
			if(ele.getText().equals("Indian")) {
				ele.click();
				break;
			}
		}
		
		test.log(Status.PASS, "Modificaiton of personal details");
	}
	
	public void saveModifiedDetails() {
		System.out.println("Saved personal details");
		test.log(Status.PASS, "Details saved");
	}

}
