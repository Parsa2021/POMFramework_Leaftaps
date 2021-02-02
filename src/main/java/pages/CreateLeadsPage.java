package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadsPage extends ProjectSpecificWrapper {
	
	
	public CreateLeadsPage enterCompName(String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
	}

	
	public CreateLeadsPage enterFirstName(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
	}

	
	public CreateLeadsPage enterLastName(String lName) {
		enterByXpath("(//input[@name='lastName'])[3]", lName);
		return this;
	}
	
	
	public ViewLeadPage clickCreateLeadsBtn() {
		clickByName("submitButton");
		return new ViewLeadPage();
	}
	
	public CreateLeadsPage chooseSource(String src) {
		//selectByVisibleTextByName("dataSourceId", src);
		selectByValueById("createLeadForm_dataSourceId", src);
		return this;
	}
	
	public CreateLeadsPage enterFnameLocal(String localFname) {
		enterByName("firstNameLocal", localFname);
		return this;
		
	}
	
	public CreateLeadsPage enterLnameLocal(String localLname) {
		enterByName("lastNameLocal", localLname);
		return this;
	}
	
	public CreateLeadsPage chooseMKTcamp(String MKTcamp) {
		selectByVisibleTextByName("marketingCampaignId", MKTcamp);
		return this;
	}
	
	public CreateLeadsPage selectSource(String source) {
		selectVisibileTextById("createLeadForm_dataSourceId", source);
		return this;
	
	}
	
	public CreateLeadsPage enterSalutation(String Salute) {
		enterByXpath("//input[@name='personalTitle']", Salute);
		return this;
	}
	
	public CreateLeadsPage enterNameTitle(String nameTitle) {
		enterByCssSelector("input[name='generalProfTitle']", nameTitle);
		return this;
	}
	
	public CreateLeadsPage enterBday (String bday) {
		enterByCssSelector("input[name='birthDate']", bday);
		return this;
	}
	
	public CreateLeadsPage enterRevenue (String annualRev) {
		enterByCssSelector("#createLeadForm_annualRevenue", annualRev);
		return this;
	}
	
	public CreateLeadsPage enterDepartment (String dept) {
		enterByXpath("//input[@name='departmentName']", dept);
		return this;
	}
	
	public CreateLeadsPage chooseCurrency(String currency) {
		selectByVisibleTextByXpath("//select[@name='currencyUomId']", currency);
		return this;
	}
	
	public CreateLeadsPage chooseIndustry (String industry) {
		selectByVisibleTextByXpath("//select[@name='industryEnumId']", industry);
		return this;
	}
	
	public CreateLeadsPage enterEmpNum(String EmpNum) {
		enterById("createLeadForm_numberEmployees", EmpNum);
		return this;
	}
	
	public CreateLeadsPage chooseOwnership(String ownership) {
		selectByVisibleTextByName("ownershipEnumId", ownership);
		return this;
	}
	
	public CreateLeadsPage enterSICcode(String SIC) {
		enterByCssSelector("#createLeadForm_sicCode", SIC);
		return this;
	}
	
	public CreateLeadsPage enterDescription (String desc) {
		enterByXpath("//textarea[@name='description']", desc);
		return this;
	}
	
	public CreateLeadsPage enterTickerSymbol(String ticker) {
		enterByCssSelector("input[name='tickerSymbol']", ticker);
		return this;
	}
	
	public CreateLeadsPage enterImpNote(String ImpNote) {
		enterByCssSelector("#createLeadForm_importantNote", ImpNote);
		return this;
	}
	
	public CreateLeadsPage enterCountryCode(String CntryCode) {
		enterById("createLeadForm_primaryPhoneCountryCode", CntryCode);
		return this;
	}
	
	public CreateLeadsPage enterAreaCode(String AreaCode) {
		enterByXpath("(//input[@name='primaryPhoneAreaCode'])[4]", AreaCode);
		return this;
	}
	
	public CreateLeadsPage enterPhnNum(String phone) {
		enterById("createLeadForm_primaryPhoneNumber", phone);
		return this;
	}
	
	public CreateLeadsPage enterExtension(String ext) {
		enterByName("primaryPhoneExtension", ext);
		return this;
	}
	
	public CreateLeadsPage enterEmailAdd(String email) {
		enterByCssSelector("#createLeadForm_primaryEmail", email);
		return this;
	}
	
	public CreateLeadsPage enterWebURL(String web) {
		enterByName("primaryWebUrl", web);
		return this;
	}
	
	public CreateLeadsPage enterAskPerson (String person) {
		enterByName("primaryPhoneAskForName", person);
		return this;
	}
	
	public CreateLeadsPage enterToName (String ToName) {
		enterById("createLeadForm_generalToName", ToName);
		return this;
	}
	
	public CreateLeadsPage enterGenAdd1 (String genAdd1) {
		enterByName("generalAddress1", genAdd1);
		return this;
	}
	
	public CreateLeadsPage enterGenAdd2 (String genAdd2) {
		enterById("createLeadForm_generalAddress2", genAdd2);
		return this;
	}
	
	public CreateLeadsPage enterGenCity(String city) {
		enterByXpath("//input[@name='generalCity']", city);
		return this;
	}
	
	public CreateLeadsPage chooseState(String state) {
		selectByVisibleTextByXpath("//select[@name='generalStateProvinceGeoId']", state);
		return this;
	}
	
	public CreateLeadsPage chooseCountry(String country) {
		selectVisibileTextById("createLeadForm_generalCountryGeoId", country);
		return this;
	}
	
	public CreateLeadsPage enterZipCode (String zip) {
		enterByXpath("//input[@name='generalPostalCode']", zip);
		return this;
	}
	
	public CreateLeadsPage enterPostalExt (String PostalExt) {
		enterByName("generalPostalCodeExt", PostalExt);
		return this;
	}	
	
	
	
	
	
}
