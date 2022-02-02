package test;

import utils.CommanMethods;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class base {
  
	static WebDriver driver;
	CommanMethods comman = new CommanMethods();
//    String browser = "chrome";
//    String url = "https://www.amazon.ca/";
    
//  @BeforeSuite
//  public void beforeSuite() {
//	  comman.launch(browser, url);
//	  driver=comman.getdriver();
//	  
//  }
    
    @Parameters({"browser","url"})
    @BeforeTest
    public void beforeSuite(String browser,String url) {
  	  comman.launch(browser,url);
  	  driver=comman.getdriver();
  	  
    }

  
  @AfterSuite
  public void afterSuite() {
	  comman.teardown();
  }

}
