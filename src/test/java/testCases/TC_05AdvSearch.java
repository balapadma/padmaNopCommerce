package testCases;


import org.testng.annotations.Test;

import pageObject.AdvSearch;
import pageObject.SearchPage;
import testBase.BaseClass;

public class TC_05AdvSearch extends BaseClass {
	@Test
	public void searchproduct()
	{
		SearchPage sp=new SearchPage(driver);
		 sp.clksearch();
		 sp.isproductexists("Desktops");
		 AdvSearch adv=new AdvSearch(driver);
		   adv.setcart();
		 
		 
		
		 
		
		 
	}
	
	

}
