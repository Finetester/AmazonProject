package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AAALandingValidation extends base {
	
	
	//validate title and url 
	  @Test 
	  public void validateurl() {
		  String expected = "https://www.amazon.ca/";
		  String actual = driver.getCurrentUrl();
		  Assert.assertTrue(expected.contains(actual), "this is not correct url"+ actual);
		  Reporter.log("this is correct url"+ actual);
		  
	  }
	  
	  
	  @Test 
	  public void validatetitle() {
		  String expected = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		  String actual = driver.getTitle();
		  Assert.assertTrue(expected.contains(actual), "this is not correct title" + actual);
		  Reporter.log("this is correct title"+ actual);
		  
		  
	  }
	
  
  
  
  
}
