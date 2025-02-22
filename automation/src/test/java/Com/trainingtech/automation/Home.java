package Com.trainingtech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(id="APjFqb") WebElement searchBox;
	@FindBy(linkText = "About") WebElement aboutBtn;
	@FindBy(linkText = "Images") WebElement imagBtn;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // page factory constructor is created
		
	}
	// this is action function for any web element
	//public void searchBox_sendkeys() {
	//	searchBox.sendKeys("computer");
	
	
	// can give any search value in the google testing class
    public void searchBox_sendkeys(String value) {
	searchBox.sendKeys(value);
	}
	//action to click on about button
    public void aboutBtn_Click() {
    	aboutBtn.click();
    }
    
  //action to click on images button
    public void imagBtn_Click() {
    	imagBtn.click();
    }
	
		
	
    

}
