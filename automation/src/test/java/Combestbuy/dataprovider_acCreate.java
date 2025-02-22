package Combestbuy;

import org.testng.annotations.Test;

import bestbuy.pages.Home;
import bestbuy.pages.createaccount;

import org.testng.annotations.DataProvider;

public class dataprovider_acCreate extends Common {
  


@Test(dataProvider = "dp")
  public void f(String firstName, String lastName, String email, String password, String phone) throws InterruptedException {
	  Home home=new Home(driver);
	  home.account_Btn_action();
	  Thread.sleep(2000);
	  home.create_account_Btn_action();
	  
	  createaccount ac=new createaccount(driver);
	  ac.firstName_action(firstName);
	  ac.lastName_action(lastName);
	  ac.email_action(email);
	  ac.password_action(password);
	  ac.phone_action(phone); 
	  
	  
	  Thread.sleep(10000);
	  driver.navigate().back();
	   
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ayesha", "raheem", "ayesha.raheem@gmail.com", "password", "1234567899" },
      new Object[] { "ayesha", "raheem", "ayesha.raheem@gmail.com", "password", "1234567899" }, //data providers are used to repeat a test, everytime it will go back and run again
    
    };
    
  }
    
  
  }
  
  
