package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class updateLeadForm extends ProjectMethods{
	
	public updateLeadForm() {
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement firstnameedit;
	
    public updateLeadForm EditFirstName(String FirstName)
    {
    	firstnameedit.clear();
    	type(firstnameedit,FirstName);
		return this;
    }
    
    @FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement update;
	
    public ViewLeads clickupdate()
    {
    	click(update);
		return new ViewLeads();
    }
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	


