package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;

public class LoginValidations extends base {
	
	
	Login login;
	
	@BeforeClass
	public void beforeclass() {    //if we dont create beforeclass method, we have to create object for every method.
		login = new Login (driver);
	}
	
  @Parameters ({"validemail"})  
  @Test                                                  //test 1 valid email 
  public void validemailkey(String em) {
	  login.passemail(em);
	  }
  
  @Parameters ({"invalidemail"}) 
  @Test                                                 //test 2 invalid email
  public void invalidemailkey(String em) {
		  login.passemail(em);
		  }
  
  @Parameters ({"validemail"})  
  @Test                                                  //test 3 valid email logout
  public void validemailkeylogout(String em) {
	  login.passemail(em);
	  }
  
  @Parameters ({"validemail"})  
  @Test                                                  //test 4 invalid email logout
  public void invalidemailkeylogout(String em) {
	  login.passemail(em);
	  }
	

}
