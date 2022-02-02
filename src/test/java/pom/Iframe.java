package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {
	
WebDriver driver;
	
	public Iframe (WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 driver.navigate().to("https://www.amazon.ca/");
}

	//POM
	
	@CacheLookup
	@FindBy(xpath="//iframe[@id='ape_Gateway_desktop-ad-center-1_desktop_iframe']")     //(locators)
	WebElement iframe;
	
	
	public void frame() {
		waits(iframe);
	    driver.switchTo().frame(iframe);
	    iframe.click();
	    
	  }
	
	
	
	public void waits (WebElement ele) {
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
}
