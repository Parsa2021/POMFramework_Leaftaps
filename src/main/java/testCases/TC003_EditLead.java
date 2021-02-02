package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC003_EditLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	
	public void setData() {
	
		excelfile = "EditLead";
		
	}
	
	@Test (dataProvider = "getData")
	
	public void editLead(String uName, String pwd, String FnameEdit) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.enterFirstN(FnameEdit)
		.clickFindLeadsButton()
		
		//need to add explicit wait???	
		.captureFirstResultLead()
		
	
		
		.clickFirstResultLead();
		//.verifyTitle(title);
	}
	
	

}
