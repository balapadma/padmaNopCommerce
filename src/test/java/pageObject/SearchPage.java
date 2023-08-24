package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
      @FindBy(xpath="//a[@href='/computers']")
       WebElement clkcomp;
     @FindBy(xpath="//h1")
      List<WebElement> lnkdesk;
      
      public void clksearch()
      {
       clkcomp.click();
      }
      
      public boolean isproductexists(String productName)
      {
    	boolean flag=false;
    	
		for(WebElement product:lnkdesk)
		{				
			if(product.getAttribute("Desktops").equals(productName))
			{
			flag=true;
			break;
    
    	}
			
    	  
}
		return flag;
		
		
		
      }
}


      