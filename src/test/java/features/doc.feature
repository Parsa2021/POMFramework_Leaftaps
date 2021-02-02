Feature: Automating TestLeaf Application

#Scenario Outline: TC_001_Login & Logout


#Given Launch Chrome browser and load URL
#And enter username as <username>
#And enter password as <password>
#When click login button
#Then it navigates to HomePage
#And click logout button
#And close browser

#Examples:
#	|username|password|
#	|DemoSalesManager|crmsfa|
#	|DemoCSR|crmsfa|
	

#Scenario: TC001_Login & Logout Fail

#Given Launch Chrome browser and load URL
#And enter username as parsaKC
#And enter UserName as Parsa
#And enter password as crmsfa
#When click login button 
#Then it navigates to SamePage
#And verify error message
#And close browser



Scenario Outline: TC002_Create Lead

Given Launch Chrome browser and load URL
And enter username as DemoSalesManager
And enter password as crmsfa
And click login button
And click CRMSFA button
And click Leads link
When Create leads link
And enter company name as <company name>
And enter first name as <first name>
And enter last name as <last name>
And click create lead button
Then it navigates to ViewLeadPage
And verify first name
And close browser

Examples:

|company name|first name|last name|
|XYZZ|Hema|Mali|
#|ABC|Raj|Kumar|
#|CBC|Gopi|Jkumar|



Scenario: TC003_Edit Lead

Given Launch Chrome browser and load URL
And enter username as DemoSalesManager
And enter password as crmsfa
And click login button
And click CRMSFA button
And click Leads link
When click Find Leads link
And enter CompanyName
And click find leads button
And click first resulting lead
Then it navigates to ViewLeadPage
And click on edit button
Then it navigates to EditLeadPage
And change the company name
And click update
And confirm changed name appears
And close browser


@smoke
Scenario: TC004_Delete Lead

Given Launch Chrome browser and load URL
And enter username as DemoSalesManager
And enter password as crmsfa
And click login button
And click CRMSFA button
And click Leads link
When click Find Leads link
And enter compName
And enter firstName
And click find leads button
And capture first Lead ID
And click first resulting lead
And click delete button
Then it navigates to MyLeadsPage
And click Find Leads link
And enter captured lead ID
And click find leads button
And verify error msg
And close browser



