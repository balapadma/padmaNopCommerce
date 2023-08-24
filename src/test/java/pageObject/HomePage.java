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
	@FindBy(xpath="//input[@id='small-searchterms']")
	 WebElement lnkSearch;
	@FindBy(xpath="//input[@id='small-searchterms']")
	 WebElement lnkSearchitem;
	@FindBy(xpath="//form[@action='/search']")
	WebElement lnkSearchList;
	@FindBy(xpath="//span[text()=\"Flower Girl Bracelet\"]")
	WebElement lnkproduct;
	
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		lnkLogin.click();
	}
	public void clickSearch()
	{
		lnkSearch.click();
	}
	
	public void setItem(String item)
	{
		lnkSearchitem.sendKeys(item);
		
	}
	public void setSearchlist(String item)
	{
	lnkSearchList.sendKeys(item);
	}
	
	public void clickproduct()
	{
        lnkproduct.click();
	}
	
	
	
	
}
