package bestbuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(linkText="Top Deals") WebElement top_deals_btn;
	@FindBy(linkText="Gift Ideas") WebElement gift_ideas_btn;
	@FindBy(xpath = "//input[@class='search-input search-input-default']") WebElement search_Bar;
	@FindBy(xpath = "//button[@aria-label='submit search']") WebElement search_Btn;
	@FindBy(xpath = "//*[text()='Account']") WebElement account_Btn;
	//@FindBy(xpath = "//*[text()='Create Account']") WebElement create_account_Btn;
	@FindBy(linkText = "Create Account") WebElement create_account_Btn;//another way to get xpath
	
	public Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // page factory constructor is created 
	}
	
	public void top_deals_action () {
        top_deals_btn.click();
	}
	
	public void gift_ideas_action() {
		gift_ideas_btn.click();
	}
	
	public void search_Bar_sendkeys(String value) {
		search_Bar.sendKeys(value);
		
	}
	
	
	 public void search_Btn_Click() {
	    	search_Btn.click();
	 }
	 
	 public void account_Btn_action() {
			account_Btn.click();
		}
	 public void create_account_Btn_action() {
			create_account_Btn.click();
		}
		
}
