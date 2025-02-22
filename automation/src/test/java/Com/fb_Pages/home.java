package Com.fb_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class home {
	WebDriver driver;




public home (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this); // page factory constructor is created
 
}

}