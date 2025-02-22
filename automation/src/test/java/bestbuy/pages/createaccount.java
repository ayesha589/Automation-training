package bestbuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createaccount {
	WebDriver driver;
	@FindBy(name = "firstName") WebElement firstName;
	@FindBy(name = "lastName") WebElement lastName;
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "fld-p1") WebElement password;
	@FindBy(name = "phone") WebElement phone;
	
	
	public createaccount (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // page factory constructor is created
	 
	}
	
	public void firstName_action(String a) {
		firstName.sendKeys(a);
	}
	
	public void lastName_action(String a) {
		lastName.sendKeys(a);
	}

	public void email_action(String a) {
		email.sendKeys(a);
	}
	
	public void password_action(String a) {
		password.sendKeys(a);
	}
	
	public void phone_action(String a) {
		phone.sendKeys(a);
	}
}
