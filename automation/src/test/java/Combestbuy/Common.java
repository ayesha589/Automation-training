package Combestbuy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Common {
public	WebDriver driver;
	public String path=System.getProperty("user.dir");
	
	 @BeforeClass (groups= {"Regression","ayesha", "multi"})
	 @Parameters({"browser_value", "web_address"})
	  public void beforeClass(String g, String web) {
		 
		  browsers (g,web);
	  }

	  @AfterClass (groups= {"Regression","ayesha", "multi"})
	  public void afterClass() throws InterruptedException {
			  Thread.sleep(10000);
			//  driver.quit();
		  
	  }

	  public void browsers (String value, String web) {
		  if (value.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
				driver=new ChromeDriver(); //open the browser
				
			  
		  }
		  
		  else if (value.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver(); //open the browser
				
		  }
		  
		  else if (value.equalsIgnoreCase("edge")) {
			  System.setProperty("webdriver.edge.driver",path+"\\drivers\\msedgedriver.exe");
				driver=new EdgeDriver(); //open the browser
				
		  
		  }
		   
		driver.get(web); // can place it here outside if else instead of writing it individ for each browser above
		driver.manage().window().maximize(); // can place it here outside if else instead of writing it individ for each browser above
	  }
	
	  public void shots1(String folderName) throws IOException {
		  Date dt=new Date ();
		  System.out.println(dt); // to get the date of screenshot just for checking, can delete it if working fine
		// to get date in string format, so different screenshots with names as per dates are saved instead of replacing a date
		  String dtStr=dt.toString().replace(" ","_").replace(":","_"); //to get date string w/o spaces & :
		  System.out.println(dtStr); //to get the date of screenshot just for checking, can delete it if working fine
		  
		  File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File Destination=new File(path+"\\src\\screenshots\\"+folderName+"\\"+dtStr+".png");
		  FileHandler.copy(capture, Destination);
	  
	  }
	 
 

  
  

}
