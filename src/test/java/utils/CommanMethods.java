package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommanMethods {
	
	WebDriver driver;
	
	public void launch(String browser,String url) {
		String path = "C:\\\\Users\\\\ajay\\\\eclipse-workspace\\\\Projectz";
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if (browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver",path+"\\Drivers\\msedgedriver.exe");	
		driver = new EdgeDriver();
		
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
	    System.getProperty("webdriver.gecko.driver",path+"\\Drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	   
		}
		
		else {
			System.out.println("this browser parameter is not correct : give valid input");
			System.exit(0);
		}
		
		
		if (url != "") {
	    driver.get(url);
		}
		else {
	    driver.get("about:blank");	
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	
	public WebDriver getdriver() {
	     return driver;
	}
	
	public void teardown() {
	    driver.quit();
	}
	
	
	

}
