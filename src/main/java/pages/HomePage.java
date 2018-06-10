package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	

	public HomePage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}
	
	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Selenium Automation Engineer')]]")
	private WebElement eleLoggedName;
	
	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;		
	}
	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="CRM/SFA")
   private WebElement Linktext; 
	
	public MyLeads clickcrmcfa()
	{
		Linktext.click();
		return new MyLeads();
	}
	
	
	}
	
	
	
	
