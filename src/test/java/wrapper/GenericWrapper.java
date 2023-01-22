package wrapper;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testCases.BaseClass;

public class GenericWrapper extends BaseClass {
	
	public static void waitUntillVisibility(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void clearAndEnter(WebElement ele, String value) {
		ele.clear();
		ele.sendKeys(value);
	}
	
	public static void dropdownSelectUsingText(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public static void scrollIntoTarget(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	
	public static String readText(WebElement ele) {
		String s;
		s=ele.getText();
		if(s.equals(null)) {
			if(!ele.getAttribute("value").equals(null)) {
				s=ele.getAttribute("value");
			}else {
				System.out.println("Text cannot be fetched");
			}
		}else {
			System.out.println("Text fetched successfully");
		}
		return s;
	}
	


}
