package Com.fb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.fb_Pages.Cat_menu;

public class secondtest extends Common{
	WebDriver driver;
	  @Test (priority =1)
	  public void login () throws InterruptedException, IOException {
		 Cat_menu menu =new Cat_menu (driver);
		// menu.Electronics_menu_action();
		Thread.sleep(8000);
		 shots1();
		Thread.sleep(8000);
		  
		//  String b=menu.page_title_r();
		 // System.out.println(b);
		//  SoftAssert softassert=new SoftAssert();
	    //  softassert.assertEquals(b, "Computers");
		
		Thread.sleep(3000);
		  
		 
		//  Assert.assertEquals(b, "Welcome to our store");
		//  System.out.println("After Assert"); // this will print & validate, if we change the above to Computers, the test will stop and no print
		  
		//  softassert.assertAll(); // this is used for soft assert */
	  }


	  @Test (priority =2, dependsOnMethods="login")
	  public void Afterlogin() {
		  System.out.println("Second Test Case");
		  
	  }
	  
	 
	  
	 
	  
	  }

