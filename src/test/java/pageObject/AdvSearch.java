package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvSearch extends BasePage{

	public AdvSearch(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()=\"Build your own computer\"]")
       WebElement product;
	public void setcart()
	{
		product.click();
	}
	
}
