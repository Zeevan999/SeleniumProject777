package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Jeevan";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String Email,String Fname) {
		
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmcfa()
		.clickLeads()
		.ClickFindLeadsLink()
		.clickFindLeadEmail()
		.EnterFindLeadsEmail(Email)
		.ClickFindLeads()
		.ClickLeadID()
		.clickEditButton()
		.EditFirstName(Fname)
		.clickupdate();
		
		
		
	
		
		
	
		
		
		
		
		
		
		
	}

}
