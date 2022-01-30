package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.AddToCart;


public class AddToCartTest extends base {
	
	AddToCart check;
		
		@BeforeClass
		public void beforeclass() {
		check = new AddToCart(driver);
		
		}
	
  @Test
  public void checkcart() {
	  check.passcart();
	  
  }
  
  
  @Test
  public void finalcheck() {
	  check.checkout();
	  
  }
  
  
  
}
