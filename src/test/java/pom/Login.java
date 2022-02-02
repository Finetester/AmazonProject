package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	
WebDriver driver;
	
	public Login (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.navigate().to("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	
	//POM 
	@CacheLookup
	@FindBy(id="ap_email")     //(locators)
	WebElement email;
	
	
	//@CacheLookup
	//@FindBy(id="continue")
	//WebElement continuebtn;
	
	
	public void passemail(String em) {
		waits(email);
		email.clear();
		email.sendKeys(em);
		
		
		//continuebtn.click();
		
	}
	
	public void waits (WebElement ele) {
		WebDriverWait wait = new WebDriverWait (driver,5);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	

}
