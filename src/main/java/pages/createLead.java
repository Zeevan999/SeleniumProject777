package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class createLead extends ProjectMethods{
	
	public createLead() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement CompanyName;
	
	public createLead enterCompanyName(String cName) {
		
		type(CompanyName,cName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement LastName;
	
	public createLead enterLastName(String Lname) {
		
		type(LastName,Lname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;
	
	public createLead enterFirstName(String fname) {
		
		type(firstName,fname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement PhoneNumber;
	
	public createLead enterPhoneNumber(String Phone) {
		
		type(PhoneNumber,Phone);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement EmailID;
	
	public createLead enterEmailAddress(String Email) {
		
		type(EmailID,Email);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement CreateLeadButton;
	
	public ViewLeads ClickCreateLead() {
		
		click(CreateLeadButton);
		return new ViewLeads();
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


