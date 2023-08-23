package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.Loginpage;
import testBase.BaseClass;

public class TC_02LoginTest extends BaseClass {
	
	@Test
	public void logintest()
	{
		try {
			
			HomePage hp= new HomePage(driver);
			   hp.clickLogin();
			
			Loginpage lp=new Loginpage(driver);
		       lp.setmail("balum234@gmail.com");
		       lp.setpassword("murali");
		       lp.clicklogin();
		   String msg=lp.confvalidation();
		   Assert.assertEquals(msg,"Welcome to our store","not match");
		}
		catch(Exception e)
		{
			Assert.fail();
}
			
		}
	}


