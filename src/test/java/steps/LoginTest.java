package steps;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {

	ChromeDriver driver;
	
	@Given("Launch Chrome browser and load URL")
	public void launchChromeBrowserAndLoadURL() {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Given("enter username as (.*)")
	public void enterUsernameAsDemosalesmanager(String Uname) {
		driver.findElementById("username").sendKeys(Uname);
	}

	@Given("enter password as (.*)")
	public void enterPasswordAsCrmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("click login button")
	public void clickLoginButton() {
		driver.findElementByXPath("//input[@value='Login']").click();
	}

	@Then("it navigates to HomePage")
	public void itNavigatesToHomePage() {
	    System.out.println(driver.getTitle());
	}

	@Then("click logout button")
	public void clickLogoutButton() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("close browser")
	public void closeBrowser() {
    driver.close();
}

	@Then("it navigates to SamePage")
	public void itNavigatesToSamePage() {
	    System.out.println(driver.getTitle());
	}

	@Then("verify error message")
	public void verifyErrorMessage() {
	    String errorMsg = driver.findElementByClassName("serviceError").getText();
	   if(errorMsg.contains("error occurred during login: User not found.")) {
		   System.out.println("error message is correct");
	   }else {
		   System.err.println("incorrect error message");
	   }
	}
	
	@Given("enter UserName as Parsa")
	public void enterUserNameAsParsa() {
		driver.findElementById("username").sendKeys("Parsa");
	}
	
	@Given("click CRMSFA button")
	public void clickCRMSFAButton() {
	    driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click Leads link")
	public void clickLeadsLink() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("Create leads link")
	public void createLeadsLink() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("enter company name as (.*)")
	public void enterCompanyNameAsTCS(String company) {
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
	}

	@When("enter first name as (.*)")
	public void enterFirstNameAsHema(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@When("enter last name as (.*)")
	public void enterLastNameAsMali(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@When("click create lead button")
	public void clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
	}

	@Then("it navigates to ViewLeadPage")
	public void itNavigatesToViewLeadPage() {
	    System.out.println(driver.getTitle());
	}

	//how to do string verification or assertion for multiple texts 
	@Then("verify first name")
	public void verifyFirstName() {
		String verifyFname = driver.findElementById("viewLead_firstName_sp").getText(); 
		System.out.println(verifyFname);
		/*if(verifyFname.equals(fstName)) {
			System.out.println("verification pass");
		}else {
			System.out.println("verification fail");
		}*/
	}

	/*@When("enter company name as ABC")
	public void enterCompanyNameAsABC() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter first name as Raj")
	public void enterFirstNameAsRaj() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter last name as Kumar")
	public void enterLastNameAsKumar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter company name as CBC")
	public void enterCompanyNameAsCBC() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter first name as Gopi")
	public void enterFirstNameAsGopi() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter last name as Jkumar")
	public void enterLastNameAsJkumar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/
	
	@When("click Find Leads link")
	public void clickFindLeadsLink() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@When("enter CompanyName")
	public void enterCompanyName() {
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("XYZZ");
	}

	@When("click find leads button")
	public void clickFindLeadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
	}

	@When("click first resulting lead")
	public void clickFirstResultingLead() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@Then("click on edit button")
	public void clickOnEditButton() {
		driver.findElementByXPath("//a[text()='Edit']").click();
	}

	@Then("it navigates to EditLeadPage")
	public void itNavigatesToEditLeadPage() {
	    System.out.println(driver.getTitle());
	}

	@Then("change the company name")
	public void changeTheCompanyName() {
	    driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
	    driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("CTS");
	}

	@Then("click update")
	public void clickUpdate() {
	    driver.findElementByClassName("smallSubmit").click();
	}

	@Then("confirm changed name appears")
	public void confirmChangedNameAppears() {
	    String CnameCng = driver.findElementById("viewLead_companyName_sp").getText();
	    if (CnameCng.contains("CTS")) {
	    	System.out.println("company name updated correctly");
	    }else {
	    	System.out.println("update failed");
	    }
	}
	
	@When("enter compName")
	public void enterCompName() {
	    driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("CTS");
	}

	@When("enter firstName")
	public void enterFirstName() {
	    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
	}

	@When("capture first Lead ID")
	public void captureFirstLeadID() {
	    String FirstLeadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	    System.out.println(FirstLeadID);
	}

	@When("click delete button")
	public void clickDeleteButton() {
	    driver.findElementByCssSelector(".subMenuButtonDangerous").click();
	}

	@Then("it navigates to MyLeadsPage")
	public void itNavigatesToMyLeadsPage() {
	    System.out.println(driver.getTitle());
	}

	@Then("enter captured lead ID")
	public void enterCapturedLeadID() {
	    driver.findElementByXPath("//input[@name='id']").sendKeys("10116");
	}

	@Then("verify error msg")
	public void verifyErrorMsg() {
	    String errMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
	    System.out.println(errMsg);
	    if(errMsg.equals("No records to display")) {
	    	System.out.println("error msg correct");
	    }else {
	    	System.out.println("no error msg");
	    }
	}
	
}
