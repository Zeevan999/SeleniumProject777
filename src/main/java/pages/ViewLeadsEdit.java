package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadsEdit extends ProjectMethods{
	
	public ViewLeadsEdit() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Edit")
	private WebElement EditButton;
	
    public updateLeadForm clickEditButton()
    {
    	click(EditButton);
    	return new updateLeadForm();
    }

	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	


