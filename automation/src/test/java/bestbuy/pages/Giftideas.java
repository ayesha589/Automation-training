package bestbuy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftideas {
	
		WebDriver driver;
		
				@FindBy(xpath = "//h1") WebElement giftIdeas_title; //this is coming from top deals page	
	public Giftideas (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this); // page factory constructor is created
		 
		}
		
		public String giftideas_title_action() {
			return giftIdeas_title.getText();
		}

	

}
