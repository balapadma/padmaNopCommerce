package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class TC_04SearchTest extends BaseClass{
	@Test
	public void searchtest() throws InterruptedException
	{
	
	 HomePage hp=new HomePage(driver);
	 hp.clickSearch();
      hp.setItem("jewelry");
      
      Thread.sleep(5000);
      
      hp.clickproduct();
      
     

	   
	}	     
    
}
