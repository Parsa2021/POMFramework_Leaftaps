package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsPage extends ProjectSpecificWrapper {
	
	public FindLeadsPage clickPhoneTab() {
		clickByXpath("//span[text()='Phone']");
		return this;
	}
	
	public FindLeadsPage enterPhoneNum(String phn) {
		enterByCssSelector("input[name='phoneNumber']", phn);
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() {
		clickByXpath("//button[text()='Find Leads']");                    
		return this;
	}
	
	
	public ViewLeadPage clickFirstResultLead() {
		clickByXpath("(//a[@class='linktext'])[4]");
		return new ViewLeadPage();
	}
	
	
	public FindLeadsPage captureFirstResultLead() {
		getTextByXpath("(//a[@class='linktext'])[4]");
		return this;
		
	}
	
	/*public FindLeadsPage captureLeadIdOfFstResLead() { 
	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"); 
	return this; 
	} */

	
	
	public FindLeadsPage enterLeadID(String leadID) {
		enterByXpath("//input[@name='id']", leadID);
		return this;
	}
	
	
	public FindLeadsPage verifyErrorMsg(String error) {
		verifyTextByXpath("//div[text()='No records to display']", error);
		return this;
	}
	
	public FindLeadsPage enterFirstN(String FnameEdit) {
		enterByXpath("(//input[@name='firstName'])[3]", FnameEdit);
		return this;
	}
	
	
	
	
}
