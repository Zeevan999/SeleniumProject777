package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement FindLeadsEmail;
	
	public FindLeads clickFindLeadEmail() {
		
		click(FindLeadsEmail);
		return this;
		
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement EnterEmail;
	
	public FindLeads EnterFindLeadsEmail(String findEmail) {
		
		type(EnterEmail,findEmail);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement FindLeads;
	
	public FindLeads ClickFindLeads() {
		
		click(FindLeads);
		return this;
		
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="10042")
	   private WebElement LeadID; 
		
		public ViewLeadsEdit ClickLeadID()
		{
			LeadID.click();
			return new ViewLeadsEdit();
		}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	


