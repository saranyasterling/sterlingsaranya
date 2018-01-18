package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BirlaVisionWrappers;

public class DTSMMachineMasterMakerPage extends BirlaVisionWrappers{
	
	public DTSMMachineMasterMakerPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		/*if (!verifyTitle("Home")) {
			reportStep("This Not Home Page", "FAIL");
		}*/
	}	
	
	public LoginPage clickLogOut() throws InterruptedException {
		Thread.sleep(3000);
		clickById(prop.getProperty("HomePage.Logout.ID"));
		return new LoginPage(driver, test);
	}
}
