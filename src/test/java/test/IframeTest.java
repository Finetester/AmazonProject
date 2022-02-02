package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.Iframe;

public class IframeTest extends base {
	
	Iframe frame;
	
	@BeforeClass
	public void beforeclass() {
	frame = new Iframe(driver);
	
	}
	
  @Test
  public void checkiframe() {
	  String expected = "https://www.amazon.ca/dp/B07X1Y6N1P/ref=syn_sd_onsite_desktop_0?pd_rd_plhdr=t&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExNUgzUFlKSkRDWEJOJmVuY3J5cHRlZElkPUEwNjkwMjE4MlNBVUhMQTlTRTVEMiZlbmNyeXB0ZWRBZElkPUEwMTQ4NzQwMVFOMkNBRFFVTktZTSZ3aWRnZXROYW1lPXNkX29uc2l0ZV9kZXNrdG9wJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ&th=1";
	  String actual = driver.getCurrentUrl();
	  Assert.assertTrue(expected.contains(actual), "this is not correct url"+ actual);
	  Reporter.log("this is correct url"+ actual);
	  
	    
  }
   
  
}
