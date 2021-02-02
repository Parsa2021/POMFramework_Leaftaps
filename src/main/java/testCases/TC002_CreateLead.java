package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper {
	
	@BeforeTest 

	public void setData() { 

	excelfile = "TC002_CreateLead"; 
	
	} 
	
	
	
	@Test (dataProvider = "getData")
	
	public void createLead (String uName, String pwd, String cName, String fName, String lName, String localFname, String localLname,
			String Salute, String source, String nameTitle, String annualRev, String industry, String ownership,
			String SIC, String desc, String ImpNote, String CntryCode, String AreaCode, String ext, String dept,
			String currency, String EmpNum, String ticker, String person, String web, String ToName, String genAdd1, 
			String genAdd2, String city, String state, String country, String zip, String PostalExt, String MKTcamp,
			String phone, String email, String FnameV) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadsLink()
		.enterCompName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterFnameLocal(localFname)
		.enterLnameLocal(localLname)
		.enterSalutation(Salute)
		.selectSource(source)
		.enterNameTitle(nameTitle)
		.enterRevenue(annualRev)
		.chooseIndustry(industry)
		.chooseOwnership(ownership)
		.enterSICcode(SIC)
		.enterDescription(desc)
		.enterImpNote(ImpNote)
		.enterCountryCode(CntryCode)
		.enterAreaCode(AreaCode)
		.enterExtension(ext)
		.enterDepartment(dept)
		.chooseCurrency(currency)
		.enterEmpNum(EmpNum)
		.enterTickerSymbol(ticker)
		.enterAskPerson(person)
		.enterWebURL(web)
		.enterToName(ToName)
		.enterGenAdd1(genAdd1)
		.enterGenAdd2(genAdd2)
		.enterGenCity(city)
		.chooseState(state)
		.chooseCountry(country)
		.enterZipCode(zip)
		.enterPostalExt(PostalExt)
		.chooseMKTcamp(MKTcamp)
		.enterPhnNum(phone)
		.enterEmailAdd(email)
		.clickCreateLeadsBtn()
		.verifyFirstName(FnameV);
		
		
		
		
		
		/*.chooseSource(src)
		.chooseMKTcamp(MKTcamp)
		.enterBday(bday)
		.chooseCurrency(currency)*/
		
	
		
		
		
	}
	
	
	

}
