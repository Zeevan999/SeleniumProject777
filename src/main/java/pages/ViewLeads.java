package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeads extends ProjectMethods{
	
	public ViewLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='First name']")
	private WebElement FirstNameText;
	
	public ViewLeads verifyFnameText(String expFirstname) {
		verifyPartialText(FirstNameText, expFirstname);
		return this;
	}
	
	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	


