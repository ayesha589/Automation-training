package Com.trainingtech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsers2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //open the browser
		driver.get("https://www.youtube.com"); //website is opening
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize browser size
		/*String Windowhandle=  driver.getWindowHandle(); //give session ID for different sessions
		System.out.println(Windowhandle);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl); */
		
		//WebElement Signin=driver.findElement(By.xpath("(//*[@aria-label='Sign in'])[1]"));
		//Signin.click();
		
		WebElement search=driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
		search.sendKeys("Pakistan");
		Thread.sleep(6000);
		
	    WebElement sear=driver.findElement(By.xpath("(//button[@aria-label=\"Search\"])"));
	    sear.click();
	    Thread.sleep(6000);
		
		WebElement clear=driver.findElement(By.xpath("(//button[@aria-label=\"Clear search query\"])"));
		clear.click();
		
		

	}

}
