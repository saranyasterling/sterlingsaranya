package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BirlaVisionWrappers;

public class TransactionEntryMakerPage extends BirlaVisionWrappers{
	
	public TransactionEntryMakerPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		/*if (!verifyTitle("Home")) {
			reportStep("This Not Home Page", "FAIL");
		}*/
	}	
	
	public LoginPage clickLogOut() throws InterruptedException {
		Thread.sleep(2000);
		clickById(prop.getProperty("HomePage.MainmenuTansactions.MenuOptionTransactionEntryMakerLogout.ID"));
		return new LoginPage(driver, test);
	}
}
