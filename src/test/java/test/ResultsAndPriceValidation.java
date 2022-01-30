package test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ResultAndPrice;



public class ResultsAndPriceValidation extends base {
	
ResultAndPrice number;
	
	@BeforeClass
	public void beforeclass() {
	number = new ResultAndPrice(driver);
	
	}
	
	
  @Test
  public void noofresults() {
	 number.gettheresults();
	  
  }
  
  
  @Test
  public void priceofmobile() {
	 number.mobile();
	  
  }
  
  
  
}
