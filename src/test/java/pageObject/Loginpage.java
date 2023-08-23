package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Loginpage extends HomePage{

	



	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='Email']")
	 WebElement vemail;
	
	@FindBy(xpath="//input[@id='Password']")
	 WebElement vpassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	  WebElement login;
	
    @FindBy(xpath="//h2[text()=\"Welcome to our store\"]")
      WebElement validation;

	
    
    public void setmail(String email)
    {
    	vemail.sendKeys(email);
    }
    
    public void setpassword(String pswrd)
    {
    	vpassword.sendKeys(pswrd);
    }
    public void clicklogin()
    {
    	login.click();
    }
    public String confvalidation()
    {
    	try {
    		return(validation.getText());
    		}
    	catch(Exception e)
    	{
    		return(e.getMessage());
    	}
    	
    	
    	
    
    }
    
    
    
}
