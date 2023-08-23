package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends HomePage {
	
	 public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//h2[text()=\"Welcome to our store\"]")
     WebElement acntpage;
	 @FindBy(xpath="//a[text()=\"Log out\"]")
     WebElement logout;
	 
	 public boolean isMyAccountPageExists()
	 {
		 try {
			  return(acntpage.isDisplayed());
			  
		 }
		 catch(Exception e)
		 {
			 return(false);
		 }
	 }
	 public void clickLogout()
	 {
		 logout.click();
	 }

}
