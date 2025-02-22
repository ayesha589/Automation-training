package bestbuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class topdeals {
	WebDriver driver;
	//@FindBy(xpath = "//a[contains(@href, '/top-deals')]") WebElement topDeal_title;
			@FindBy(xpath = "//h1") WebElement topDeal_title; //this is coming from top deals page	
	public topdeals (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // page factory constructor is created
	 
	}
	
	public String topdeal_title_action() {
		return topDeal_title.getText();
	}

}
