package Com.fb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

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
	WebDriver driver;
  
	 @BeforeClass
	  public void beforeClass() {
		  browsers ("chrome");
			
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException {
			  Thread.sleep(10000);
			 //  driver.quit();
		  
	  }

	  public void browsers (String value) {
		  if (value.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
				driver=new ChromeDriver(); //open the browser
				
			  
		  }
		  
		  else if (value.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver(); //open the browser
				
		  }
		  
		  else if (value.equalsIgnoreCase("edge")) {
			  System.setProperty("webdriver.edge.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\msedgedriver.exe");
				driver=new EdgeDriver(); //open the browser
				
		  
		  }
		   
		driver.get("https://www.google.com"); // can place it here outside if else instead of writing it individ for each browser above
		driver.manage().window().maximize(); // can place it here outside if else instead of writing it individ for each browser above
	  }
	
	  public void shots1() throws IOException {
		  Date dt=new Date ();
		  System.out.println(dt); // to get the date of screenshot just for checking, can delete it if working fine
		// to get date in string format, so different screenshots with names as per dates are saved instead of replacing a date
		  String dtStr=dt.toString().replace(" ","_").replace(":","_"); //to get date string w/o spaces & :
		  System.out.println(dtStr); //to get the date of screenshot just for checking, can delete it if working fine
		  
		  File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File Destination=new File("C:\\Users\\amina\\eclipse-workspace\\automation\\src\\screenshots\\\\"+dtStr+".png");
		  FileHandler.copy(capture, Destination);
	  
	  }
	 
}
