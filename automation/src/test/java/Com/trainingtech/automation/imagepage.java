package Com.trainingtech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imagepage {
	WebDriver driver;
	@FindBy(id="APjFqb") WebElement searchBox;
	@FindBy(xpath = "//input[@value='Google Search']") WebElement searBtn;
	
	//input[@value='Google Search']

	public imagepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // page factory constructor is created
     
	}
	
	 public void searchBox_sendkeys(String value) {
			searchBox.sendKeys(value);
			}
	 
	 public void searBtn_Click() {
	    	searBtn.click();
	 }
}
