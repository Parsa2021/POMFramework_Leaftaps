package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper {

	/*public ViewLeadPage verifyFirstName(String FnameV) {
		verifyTextById("viewLead_firstName_sp", FnameV);
		return this;	
	}*/
	
	public ViewLeadPage verifyFirstName(String FnameV) {
		verifyTextById("viewLead_firstName_sp", FnameV);
		return this;	
	}
	
	
	public ViewLeadPage verifyPageTitle(String title) {
		verifyTitle(title);
		return this;
	}	
	
	public MyLeadsPage clickDeleteButton() {
		clickByCssSelector(".subMenuButtonDangerous");
		return new MyLeadsPage();
	}
	
}
