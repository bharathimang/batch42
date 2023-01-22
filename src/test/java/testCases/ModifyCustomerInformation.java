package testCases;

import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import pages.MyInformationPage;

public class ModifyCustomerInformation extends BaseClass {

	// 1. Login
	// 2. Validate dashboard Menu
	// 3. click on my info
	// 4. modify personal details

	@Test
	public void modifyPersonalDetails() throws Throwable {
		LoginPage lp = new LoginPage();
		lp.login();

		DashboardPage dp = new DashboardPage();
		dp.validateDashboardMenus();
		dp.clickOnMyInfo();

		MyInformationPage mp = new MyInformationPage();
		mp.modifyPersonalDetails();
		//mp.saveModifiedDetails();
	}

	/*
	 * @Test public void modifyContactDetails() { LoginPage lp=new LoginPage();
	 * lp.login();
	 * 
	 * DashboardPage dp=new DashboardPage(); dp.validateDashboardMenus();
	 * dp.clickOnMyInfo();
	 * 
	 * MyInformationPage mp=new MyInformationPage();
	 * 
	 * mp.modifyPersonalDetails(); mp.saveModifiedDetails();
	 * 
	 * }
	 */

}
