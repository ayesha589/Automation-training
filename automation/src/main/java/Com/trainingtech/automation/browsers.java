package Com.trainingtech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class browsers {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //open the browser
		driver.get("https://www.facebook.com"); //website is opening
		Thread.sleep(6000);
	//	driver.navigate().to("https:amazon.com");//another way to open a website
		
		//maximize,back,forward,refresh,close
	/*	driver.manage().window().maximize(); //maximize browser size
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.close();
		*/
String Windowhandle=  driver.getWindowHandle(); //give session ID for different sessions
System.out.println(Windowhandle);
String CurrentUrl=driver.getCurrentUrl();
System.out.println(CurrentUrl);
//driver.findElement(By.name("login"));
WebElement LoginButton=driver.findElement(By.name("login"));

//
WebElement Emailfields=driver.findElement(By.name("email"));
//WebElement CreateAccount=driver.findElement(By.linkText("Create new account"));
WebElement CreateAccount= driver.findElement(By.partialLinkText("Create"));

Emailfields.sendKeys("it@gmail.com");
CreateAccount.click();
Thread.sleep(3000);
//WebElement Password=driver.findElement(By.id("pass"));
WebElement Password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
Password.sendKeys("abc@123");
Thread.sleep(3000);

//WebElement gen =driver.findElement(By.xpath("//input[@class='_8esa' and @value='2']"));
//gen.click();

WebElement gen=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
gen.click();

/*WebElement month=driver.findElement(By.id("month")); // first step is to create a webelement

Select mont=new Select(month); //second step is to create select Select object and assign it webelement created before
mont.selectByIndex(0); // function to select option by index it will start with a zero

Thread.sleep(3000);
mont.selectByVisibleText("Aug");

Thread.sleep(3000);
mont.selectByValue("12");

WebElement day=driver.findElement(By.id("day"));
Select Day=new Select(day);
Day.selectByIndex(0);

Thread.sleep(3000);
Day.selectByVisibleText("31");

Thread.sleep(3000);
Day.selectByValue("12");

WebElement year=driver.findElement(By.id("year"));
Select Year=new Select(year);
Year.selectByIndex(1);

Thread.sleep(3000);
Year.selectByVisibleText("1990");

Thread.sleep(3000);
Year.selectByValue("1985"); */


//*[contains(@class,'mbs _52lq')]      //*[contains(text(),'Create a new')]
//*[contains(@aria-label, 'Mobile number or email')]

WebElement createa=driver.findElement(By.xpath("//*[contains(@class,'mbs _52lq')]"));
String value=createa.getText();
System.out.println(value);

if(value!="")
{
	System.out.println("Passed");
}
else {
	System.out.println("failed");
}

	









//WebElement SignUp=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));


//(//*[@class='_9407 _5dba _9hk6 _8esg'])[2]
//tagname[@attribute_name='value'];
//LoginButton.click();
//CreateAccount.click();	

		

	}

}
