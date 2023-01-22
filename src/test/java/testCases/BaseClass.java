package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.ConfigUtils;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports r;
	public static ExtentTest test;
	
	@BeforeClass
	public void initializeBrowser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(ConfigUtils.readConfigData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		ExtentHtmlReporter report=new ExtentHtmlReporter("src/test/resources/reports/extent.html");
		r=new ExtentReports();
		r.attachReporter(report);
		test=r.createTest("Demo Test");
		
	}
	
	@AfterClass
	public void tearDown() {
	//	driver.close();
	//	driver.quit();
		r.flush();
	}
}
