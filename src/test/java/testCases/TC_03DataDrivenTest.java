package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.Loginpage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviderTest;

public class TC_03DataDrivenTest extends BaseClass{
	
	@Test(dataProvider="LoginData" , dataProviderClass=DataProviderTest.class)
	public void  DDtlogin(String Email,String pswd , String exp)
	{
		try {
			HomePage hp=new HomePage(driver);
			  hp.clickLogin();
			  
			  Loginpage llp=new Loginpage(driver);
			        llp.setmail(Email);
			       llp.setpassword(pswd);
			       llp.clicklogin();
			       
			       MyAccountPage macc=new MyAccountPage(driver);
			       boolean targetpage=macc.isMyAccountPageExists();
			       
			       
			       if (exp.equals("Valid")) {
						if (targetpage == true) {
							macc.clickLogout();
							Assert.assertTrue(true);
						} else {
							Assert.assertTrue(false);
						}
					}

					if (exp.equals("Invalid")) {
						if (targetpage == true) {
							MyAccountPage myaccpage = new MyAccountPage(driver);
							myaccpage.clickLogout();
							Assert.assertTrue(false);

		}
	}
	
		else {
			Assert.assertTrue(true);
		}
		}

		 catch (Exception e) {
			Assert.fail();
		}
	}


}
