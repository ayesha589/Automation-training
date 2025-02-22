package Combestbuy;

import org.testng.annotations.Test;


import bestbuy.pages.Home;
import bestbuy.pages.topdeals;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class bestbuy_testing extends Common {
	
	@Test
  public void f() throws InterruptedException, IOException {
	  Home hm=new Home(driver);
	  hm.top_deals_action();
	  
	  topdeals tp=new topdeals(driver);
	  String strg=tp.topdeal_title_action();
	  assertEquals(strg, "Top Deals");
	  
	  Thread.sleep(3000);
	  
	  hm.gift_ideas_action();
	  
	 
	  
	  hm.search_Bar_sendkeys("Phone");
	  hm.search_Btn_Click();
	  
	  Thread.sleep(3000);
	  
	  
	  
	 // driver.navigate().back();
  }
 

}
