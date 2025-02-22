package Com.trainingtech.automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class school {
	WebDriver driver;
  @Test (priority=1) //to add priority for which to run first, otherwise it runs alphabetically
  public void f() {
	  WebElement jj=driver.findElement(By.xpath("//a[text()='JAVA']"));
	  jj.click();
  }
  
  @Test (priority=2)
  public void q() {
	  WebElement jj=driver.findElement(By.xpath("//a[text()='PHP']"));
	  jj.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test starting");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Test ending");
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //open the browser
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
