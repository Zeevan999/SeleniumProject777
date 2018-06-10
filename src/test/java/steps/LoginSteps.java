package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {

	public static RemoteWebDriver driver;
	@Given("Invoke the LeafTap Application")
	public void invokeApp(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@And("Enter the UserName as (.*)")
	public void enterUserName(String uName){
		driver.findElementById("username").sendKeys(uName);	
	}
	@And("Enter the password as (.*)")
	public void enterPasswordName(String Password){
		driver.findElementById("password").sendKeys(Password);
	} 
	@And("Click the login")
		public void clicklogin(){
			driver.findElementByClassName("decorativeSubmit").click();
		}
	@Then("Verify the login Success")
		public void verifylogin(){
			System.out.println("Success Login");
		}
	}



