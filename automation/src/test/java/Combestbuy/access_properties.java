package Combestbuy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import bestbuy.pages.Home;
import bestbuy.pages.createaccount;

public class access_properties extends Common {
  @Test (groups = {"Regression"}, priority=1)
  public void f() throws IOException, InterruptedException {
	  FileInputStream fs=new FileInputStream ("C:\\Users\\amina\\eclipse-workspace\\automation\\src\\logindetails.properties");
      Properties pr=new Properties(); //both fs and properties are used here to get a file & read it e.g pdf, images etc, acts like a translator
      pr.load(fs);
      
      String email=pr.getProperty("EmailUser1");
      System.out.println(email);
      
      String password=pr.getProperty("passwordUser1");
      System.out.println(password);
      
      String firstname=pr.getProperty("firstname");
      System.out.println(firstname);
      String lastname=pr.getProperty("lastname");
      System.out.println(lastname);
      String phone=pr.getProperty("phone");
      
      Home home=new Home(driver);
	  home.account_Btn_action();
	  Thread.sleep(2000);
	  home.create_account_Btn_action();
	  
	  createaccount ac=new createaccount(driver); //access properties use the same tests, if the values get updated login details file, it automatically gets updated here, dont need to run the tests repeatedly
	  ac.firstName_action(firstname);
	  ac.lastName_action(lastname);
	  ac.email_action(email);
	  ac.password_action(password);
	  ac.phone_action(phone); 
	  
	  Thread.sleep(2000);
  }
    
  @Test (groups = {"Regression","ayesha"}, priority=2)
  public void asdad() {System.out.println("asdadsd");
  }
  

  @Test (groups = {"multi"})
 // public void asssdad() {System.out.println("asssdadsd");
 
  
  public void multiElements() {
	  String [] listofButtons= {"Top Deals", "Deal of the Day","Yes, Best Buy Sells That","My Best Buy Memberships","Credit Cards","Gift Cards","Gift Ideas","Sign In","Create Account"};
	  List<WebElement> ListOfA=driver.findElements(By.xpath("//nav[@aria-label='utility']//a"));
      System.out.println(ListOfA.size());
    	  int i=0;
    	  for (WebElement a:ListOfA) {
    		  Assert.assertEquals(listofButtons, a.getText());
    		  i++; 
    	  }
  }
  
}  
 // we created the above array,For loop & Assert function to verify if the buttons are correct
 //if the test passes, buttons on website match the array list, size of list gets printed too   	  
    	  
  
  

