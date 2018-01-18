package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.BirlaVisionWrappers;

public class TC001_Login extends BirlaVisionWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName =  "TC001_Login";
		testDescription = "Login to Birla";
		authors = "saranya";
		category = "smoke";
		browserName = "chrome";
		dataSheetName = "TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void BirlaLogin(String uName, String pwd,String vName) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin("You have logged in already.")
		.clickFaxTracking()
		.clickLogOut();
		//.verfiLoginName(vName)
		//.clickLogOut();
		
		
		
	}

}
