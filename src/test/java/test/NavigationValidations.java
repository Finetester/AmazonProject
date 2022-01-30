package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Navigation;

public class NavigationValidations extends base {
	
	Navigation navigate;
	
	@BeforeClass
	public void beforeclass() {
	navigate = new Navigation(driver);
	
	}
	
	
	
  @Test(priority=1)
  public void validatwishlistpage() {
	  String expected = "https://www.amazon.ca/hz/wishlist/intro";
	  String actual = driver.getCurrentUrl();
	  Assert.assertTrue(expected.contains(actual), "this is not correct url"+ actual);
	  Reporter.log("this is correct url"+ actual);
  
  }
  
  @Test(priority=2)
  public void validateamazoncashpage() {
	  String expected = "https://www.amazon.ca/gp/browse.html?node=17321486011&ref_=footer_cash_ca_en";
	  String actual = driver.getCurrentUrl();
	  Assert.assertTrue(expected.contains(actual), "this is not correct url"+ actual);
	  Reporter.log("this is correct url"+ actual); 
  
}
  
  @Test(priority=3)
  public void validatenewreleasepage() {
	  String expected = "https://www.amazon.ca/gp/new-releases/?ref_=nav_cs_newreleases";
	  String actual = driver.getCurrentUrl();
	  Assert.assertTrue(expected.contains(actual), "this is not correct url"+ actual);
	  Reporter.log("this is correct url"+ actual);
  
}
 
  
}