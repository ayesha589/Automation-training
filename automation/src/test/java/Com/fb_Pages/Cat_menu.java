package Com.fb_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cat_menu {
	WebDriver driver;
	
	@FindBy(xpath="(//li/a[text()='Computers '])[1]") WebElement Computers_menu;
	@FindBy(xpath="(//li/a[text()='Electronics '])[1]") WebElement Electronics_menu;
	@FindBy(xpath="(//li/a[text()='Apparel '])[1]") WebElement Apparel_menu;
	@FindBy(xpath="(//li/a[text()='Digital downloads '])[1]") WebElement Digital_downloads_menu;
	@FindBy(xpath="(//li/a[text()='Books '])[1]") WebElement Books_menu;
	@FindBy(xpath="(//li/a[text()='Jewelry '])[1]") WebElement Jewelry_menu;
	@FindBy(xpath="(//li/a[text()='Gift Cards '])[1]") WebElement Gift_cards_menu;
	//@FindBy(xpath="(//*[@class='topic-block-title']/h2") WebElement page_title;

	public Cat_menu (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // page factory constructor is created
     
	}

// public String page_title_r() {
// String a=page_title.getText();
//  return a;
 // }
  
	
  public void Computers_menu_action() {
   Computers_menu.click();
}

  public void Electronics_menu_action() {
	   Electronics_menu.click();

	}
  
  public void Apparel_menu_action() {
	   Apparel_menu.click();

	}

  public void Digital_downloads_menu_action() {
	   Digital_downloads_menu.click();

	}

  public void Books_menu_action() {
	   Books_menu.click();

	}
  
  public void Jewelry_menu_action() {
	   Jewelry_menu.click();

	}
  
  public void Gift_cards_action() {
	   Gift_cards_menu.click();

	}
}