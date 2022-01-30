package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
WebDriver driver;
	
	public AddToCart (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 driver.navigate().to("https://www.amazon.ca/");
}

	//POM 
	
	@CacheLookup
	@FindBy(xpath="//div[@class='a-section a-spacing-small'][1]")     //(locators)
	WebElement itemlink;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='a-size-base a-color-base a-link-normal a-text-normal'][1]")     //(locators)
	WebElement item;
	
	@CacheLookup
	@FindBy(xpath="//input[@id='add-to-cart-button']")     //(locators)
	WebElement addtocart;
	
	@CacheLookup
	@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")     //(locators)
	WebElement addtocarttext;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")     //(locators)
	WebElement proceedtocheckout;
	
	
	public void passcart() {
		waits(itemlink);
		itemlink.click();
		
		waits(item);
		item.click();
	
		
		waits(addtocart);
		addtocart.click();	
		
		waits(addtocarttext);
		addtocarttext.getText();
		System.out.println(addtocarttext.getText());
		
	}
	
	
	public void checkout() {
		waits(proceedtocheckout);
		proceedtocheckout.click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		
	}
	
	
	
	public void waits (WebElement ele) {
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	
	
	
	
	
}
