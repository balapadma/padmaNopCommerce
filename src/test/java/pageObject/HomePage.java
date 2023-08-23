package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath="//a[text()='Register']")
      WebElement lnkRegister;
	
	@FindBy(xpath="//a[@class='ico-login']")
	 WebElement lnkLogin;
	
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		lnkLogin.click();
	}
}
