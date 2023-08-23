package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends HomePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(id="gender-female")
	  WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement frstname;
	
	@FindBy(id="LastName")
	WebElement lstname;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']//option[@value='2']")
	 WebElement date;
	
	
	
       @FindBy(xpath="//select[@name='DateOfBirthMonth']//option[text()=\"March\"]")
		WebElement month;
	
		
	@FindBy(xpath="//select[@name='DateOfBirthYear']//option[text()=\"1995\"]")
	WebElement year;
	
	  
	
	
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Company")
	WebElement company;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(name="ConfirmPassword")
	WebElement confpassword;
	
	@FindBy(id="register-button")
	WebElement regbtn;
	@FindBy(xpath="//div[text()='Your registration completed']")
	 WebElement msgConfirmation;
	
	public void clickgender() {
	   gender.click();
	}
	
   public void setfrstname(String fname) {
     frstname.sendKeys(fname);
   }
   
   public void setlstname(String lname) {
	   lstname.sendKeys(lname);
   }
   public void clickdate() {
	   date.click();
   }
   public void clickmonth() {
	   month.click();
   }   
	   
	   public void clickyear() {
		   year.click();
		   
	   }
	   public void setemail(String Email) {
	     email.sendKeys(Email);
	   }
	   
	   public void setpassword(String psword) {
	     password.sendKeys(psword);
	   }
	   
	   public void setconfpsword(String cnfpsword) {
		    confpassword.sendKeys(cnfpsword);
	   }
	   
	   public void clickregister() {
		   regbtn.click();
	   }
	   public String getConfirmationMsg() {
			try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}
	   
	   
	 }

}





