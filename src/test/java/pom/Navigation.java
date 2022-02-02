package pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Navigation {

	WebDriver driver;
	
	public Navigation (WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	   driver.navigate().to("https://www.amazon.ca/");
	}
	
	
	//POM
	
	// navigate to create a wishlist
	public void actionexample() {
		WebElement accountandlist = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions (driver);
		action.moveToElement(accountandlist).build().perform();    
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		     	e.printStackTrace();
		}
	     
	     WebElement wishlist =  driver.findElement(By.xpath("//span[@class='nav-text'][1]"));
		    wishlist.click();
		    try {
				Thread.sleep(2000);                          
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		 // navigate to new release page
		    
		    //go back to homepage first and then click on new release
		    WebElement home = driver.findElement(By.id("nav-logo-sprites"));
		    home.click();
		    WebElement newrelease = driver.findElement(By.className("nav-a  "));
		    newrelease.click();
		    
		    //again go back to homepage
		    WebElement homepage = driver.findElement(By.id("nav-logo-sprites"));
		    homepage.click();
	
	}
	
	
	    // navigate to amazon cash page
		    public void javascriptexecutor(){
		       
		        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		        WebElement locator = driver.findElement(By.className("nav_a"));
		        JavascriptExecutor jumbo = (JavascriptExecutor)driver;
		      
		        jumbo.executeScript("arguments[0].scrollIntoView();", locator);
		        
		        jumbo.executeScript("arguments[0].style.border='10px solid green'",locator);
		       
		        jumbo.executeScript("arguments[0].click;", locator);
		       
		        WebElement homepage = driver.findElement(By.id("nav-logo-sprites"));
			    homepage.click();
		        
			}
		  	
//		    public void location() {
//		    	WebElement loc = driver.findElement(By.id("nav-global-location-slot"));
//		    	loc.click();
//		    	 WebElement button = driver.findElement(By.xpath("//input[@class='a-declarative a-span5']"));
//		          button.click();
//		          button.sendKeys("l5v2t5");
//		          WebElement inputbutton = driver.findElement(By.xpath("//div[@class='a-column a-span4 a-span-last']"));
//		               inputbutton.click();
//		               
//		      WebElement pincode = driver.findElement(By.className("nav-line-2 nav-progressive-content"));
//		              pincode.getText();
//		    
//	
//		    	
//		    }
		    
}
