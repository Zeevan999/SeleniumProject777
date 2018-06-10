package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Leads")
	private WebElement LeadsLink;
	
	public MyLeads clickLeads() {
		click(LeadsLink);
		return this;
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Create Lead")
	private WebElement createLeadLink;
	
	public createLead clickCreateLead() {
		click(createLeadLink);
		return new createLead();
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Find Leads")
	private WebElement FindLeadsLink;
	
	public FindLeads ClickFindLeadsLink()
	{
		click(FindLeadsLink);
		return new FindLeads();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


