package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.BirlaVisionWrappers;

public class HomePage extends BirlaVisionWrappers{

	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if (!verifyTitle("Home")) {
			reportStep("This Not Home Page", "FAIL");
		}
	}	

	public LoginPage clickLogOut() {
		clickById(prop.getProperty("HomePage.Logout.ID"));
		return new LoginPage(driver, test);
	}

	public HomePage verfiLoginName(String text) {
		verifyTextContainsByXpath(prop.getProperty("HomePage.LoginnameText.Xpath"),text);
		return this;
	}	


	public DTSMMachineMasterMakerPage clickDTSMMachineMasterMakerMenu() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuAdmin.ID"),prop.getProperty("HomePage.MainmenuAdmin.MenuOptionDTSMMachineMasterMakerPage.ID"));
		return new DTSMMachineMasterMakerPage(driver, test);
	}
	public DTSMMachineMasterCheckerPage clickDTSMMachineMasterChekerMenu() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuAdmin.ID"),prop.getProperty("HomePage.MainmenuAdmin.MenuOptionDTSMMachineMasterChekerPage.ID"));
		return new DTSMMachineMasterCheckerPage(driver, test);
	}
	public ExtendCutOffTimePage clickExtendCutOffTime() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuAdmin.ID"),prop.getProperty("HomePage.MainmenuAdmin.MenuOptionExtendCutOffTime.ID"));
		return new ExtendCutOffTimePage(driver, test);
	}
	public UserEntitlementsPage clickUserEntitlements() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuAdmin.ID"),prop.getProperty("HomePage.MainmenuAdmin.MenuOptionUserEntitlements.ID"));
		return new UserEntitlementsPage(driver, test);
	}
	public UserStatusPage clickUserStatus() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuAdmin.ID"),prop.getProperty("HomePage.MainmenuAdmin.MenuOptionUserStatus.ID"));
		return new UserStatusPage(driver, test);
	}
	public FaxTrackingPage clickFaxTracking() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuGeneralServices.ID"),prop.getProperty("HomePage.MainmenuGeneralServices.MenuOptionFaxTracking.ID"));
		return new FaxTrackingPage(driver, test);
	}
	public EODMarkingPage clickEODMarking() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionEODMarking.ID"));
		return new EODMarkingPage(driver, test);
	}
	public DTSMServiceRequestMakerPage clickDTSMServiceRequestMaker() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionDTSMServiceRequestMaker.ID"));
		return new DTSMServiceRequestMakerPage(driver, test);
	}
	public DTSMSChangeRequestCheckerPage clickDTSMSChangeRequestChecker() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionDTSMChangeRequestChecker.ID"));
		return new DTSMSChangeRequestCheckerPage(driver, test);
	}
	public TransactionEntryMakerPage clickTransactionEntryMaker() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionTransactionEntryMaker.ID"));
		return new TransactionEntryMakerPage(driver, test);
	}
	public TransactionEntryCheckerPage clickTransactionEntryChecker() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionTransactionEntryChecker.ID"));
		return new TransactionEntryCheckerPage(driver, test);
	}
	public RejectionCheckerPage clickRejectionChecker() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionRejectionChecker.ID"));
		return new RejectionCheckerPage(driver, test);
	}
	public ForceDTSMAlignmentPage clickForceDTSMAlignment() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionForceDTSMAlignment.ID"));
		return new ForceDTSMAlignmentPage(driver, test);
	}
	public WastageCancellationEntryPage clickWastageCancellationEntry() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuTansactions.ID"),prop.getProperty("HomePage.MainmenuTansactions.MenuOptionWastageCancellationEntry.ID"));
		return new WastageCancellationEntryPage(driver, test);
	}
	public FaxReportPage clickFaxReport() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuReport.ID"),prop.getProperty("HomePage.MenuOptionFaxReport.ID"));
		return new FaxReportPage(driver, test);
	}
	public TransactionReportScheduleFTNFTPage clickTransactionReportScheduleFTNFTPage() throws InterruptedException
	{

		clickMenu(prop.getProperty("HomePage.MainmenuReport.ID"),prop.getProperty("HomePage.MenuOptionTransactionReportScheduleFTNFTPage.ID"));
		return new TransactionReportScheduleFTNFTPage(driver, test);
	}


	public DTSMChangeApprovalReportPage clickDTSMChangeApprovalReportMenu() throws InterruptedException
	{
		clickMenu(prop.getProperty("HomePage.MainmenuReport.ID"),prop.getProperty("HomePage.SubmenuDTSMRpt.ID"),prop.getProperty("HomePage.SubmenuOptionDTSMChangeApprovalRpt.ID"));

		return new DTSMChangeApprovalReportPage(driver, test);
	}
	public DTSMMissingNumberReportPage clickDTSMMissingNumberReportMenu() throws InterruptedException
	{
		clickMenu(prop.getProperty("HomePage.MainmenuReport.ID"),prop.getProperty("HomePage.SubmenuDTSMRpt.ID"),prop.getProperty("HomePage.SubmenuOptionDTSMMissingNumberReport.ID"));

		return new DTSMMissingNumberReportPage(driver, test);
	}
	public DTSMBranchesPendingforAlignmentReportPage clickDTSMBranchesPendingforAlignmentReportMenu() throws InterruptedException
	{
		clickMenu(prop.getProperty("HomePage.MainmenuReport.ID"),prop.getProperty("HomePage.SubmenuDTSMRpt.ID"),prop.getProperty("HomePage.SubmenuOptionDTSMBranchesPendingforAlignmentReport.ID"));

		return new DTSMBranchesPendingforAlignmentReportPage(driver, test);
	}
}
