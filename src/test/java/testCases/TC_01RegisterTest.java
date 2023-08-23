package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegisterPage;
import testBase.BaseClass;

public class TC_01RegisterTest extends BaseClass{
	
	@Test
	public void Registrationtest()
	{
		try {
			logger.info("**test started and click register**");
		HomePage hp=new HomePage(driver);
		 hp.clickRegister();
		  logger.info("**register page started**");
		 RegisterPage rp=new RegisterPage(driver);
		    rp.clickgender();
		    rp.setfrstname(randomeString().toUpperCase());
		    rp.setlstname(randomeString().toUpperCase());
		    rp.clickdate();
		    logger.info("***month started***");
		     rp.clickmonth();
		     logger.info("**year started***");
		      rp.clickyear();
		      rp.setemail(randomeString()+"@gmail.com");
		      String password=randomAlphaNumeric();
		    rp.setpassword(password);
		    Thread.sleep(3000);
		    rp. setconfpsword(password);
		    logger.info("**clicked on register**");
		    rp.clickregister();
		    logger.info("**registration completed**");
		    String confmsg=rp.getConfirmationMsg();
		Assert.assertEquals(confmsg,"Your registration completed");
		
	}catch(Exception e)
		{
		   Assert.fail();
		}
	

}
}