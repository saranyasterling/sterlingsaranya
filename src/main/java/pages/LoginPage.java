package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BirlaVisionWrappers;

public class LoginPage extends BirlaVisionWrappers{

	public LoginPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		if (!verifyTitle("Login")) {
			reportStep("This Not LogIn Page", "FAIL");
		}
	}

	public LoginPage enterUserName(String data) {

		enterById(prop.getProperty("LoginPage.UserName.ID"),data);
		return this;
	}

	public LoginPage enterPassword(String data) {	
		enterById(prop.getProperty("LoginPage.Password.ID"),data);
		return this;
	}

	public HomePage clickLogin(String VText) throws InterruptedException {
		
		clickById(prop.getProperty("LoginPage.Login.ID"));

		boolean b;
		try {
			b =  verifyTextPresentErrMsg(VText);
			System.out.println("Popup box is present or not"+b);

			if(b)
			{
				System.out.println("Pop up present"+b);
				WebDriverWait wait = new WebDriverWait(driver, 5); 
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(prop.getProperty("LoginPage.Continue.ID"))));
				clickById(prop.getProperty("LoginPage.Continue.ID"));
			}
			else
			{
				System.out.println("Pop up present"+b);
				//Thread.sleep(2000);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		return new HomePage(driver,test);
	}


}
