package Com.trainingtech.automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class googletesting {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Home hom=new Home (driver);
	  hom.searchBox_sendkeys("computers");
	  Thread.sleep(5000);
	  
	  hom.imagBtn_Click();
	  imagepage impge= new imagepage (driver);
	  impge.searchBox_sendkeys("softwares");
	  impge.searBtn_Click();  
  }
  

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //open the browser
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.quit();
  }

}
