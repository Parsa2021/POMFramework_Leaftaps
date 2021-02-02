package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeadsPage extends ProjectSpecificWrapper {

	public CreateLeadsPage clickCreateLeadsLink() {
		clickByLinkText("Create Lead");
		return new CreateLeadsPage();
	}
	
	
	public FindLeadsPage clickFindLeadsLink() {
		clickByLinkText("Find Leads");
		return new FindLeadsPage();
	}
	
	
}
