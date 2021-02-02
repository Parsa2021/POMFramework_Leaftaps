$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automating TestLeaf Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC004_Delete Lead",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch Chrome browser and load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.launchChromeBrowserAndLoadURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterUsernameAsDemosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterPasswordAsCrmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click CRMSFA button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickCRMSFAButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Leads link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickLeadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Find Leads link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTest.clickFindLeadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter compName",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterCompName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter firstName",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click find leads button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickFindLeadsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capture first Lead ID",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.captureFirstLeadID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click first resulting lead",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickFirstResultingLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click delete button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickDeleteButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it navigates to MyLeadsPage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.itNavigatesToMyLeadsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Find Leads link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickFindLeadsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter captured lead ID",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.enterCapturedLeadID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click find leads button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.clickFindLeadsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error msg",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.verifyErrorMsg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});