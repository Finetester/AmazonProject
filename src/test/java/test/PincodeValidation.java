package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Pincode;

public class PincodeValidation extends base {
	
    Pincode area;
	
	@BeforeClass
	public void beforeclass() {
	area = new Pincode(driver);
	
	}
	
	
  @Test(priority=1)
  public void verifypincode() {
	 area.passpincode("l5v2t5");
	    
  }
  
  
//  @Test(priority=2)
//  public void checkdeliverylocation() {
//	 area.dealingwithdelivery();
//	    
//  }
  
  
  
}
