package Com.trainingtech.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertspractice {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //open the browser
		driver.get("https://demoqa.com/alerts"); //website is opening
		//driver.manage().window().maximize();
		Thread.sleep(2000);

	    /*WebElement alert_Btn=driver.findElement(By.id("alertbutton"));
	    alert_Btn.click();
	    Thread.sleep(2000);
	    //driver.switchTo().alert().accept();*/
	    
	    /*Alert k=driver.switchTo().alert();
	    k.accept(); */
	    
	    
	    WebElement alert_timer_Btn=driver.findElement(By.id("timerAlertButton"));
	    alert_timer_Btn.click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	
	    WebElement alert_confirm_Btn=driver.findElement(By.id("confirmButton"));
	    alert_confirm_Btn.click();
	    Thread.sleep(3000);
	    //driver.switchTo().alert().accept(); to press ok in alert box
	    driver.switchTo().alert().dismiss(); // to press cancel in alert box 
	 
	 // clicking promt button was throwing exception with message that Button is not clickable. I added following 3 lines to scroll the woindow down to bring the button in the current view so that it is now clickable
	 		JavascriptExecutor js = (JavascriptExecutor) driver;        
	         js.executeScript("window.scrollBy(0, 500)"); // Scroll down by 500 pixels (you can change this value)
	         Thread.sleep(500);
	 // After adding the above lines now the program is not throwing the exception
	
		WebElement alert_promt_Btn=driver.findElement(By.id("promtButton"));
        alert_promt_Btn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Ayesha");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
	
	}

}
