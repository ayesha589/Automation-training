package Com.trainingtech.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class mouseover {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //open the browser
		//driver.get("https://amazon.com/"); //website is opening
		driver.get("https://jqueryui.com/droppable/"); //website is opening
		
		driver.manage().window().maximize();
		Thread.sleep(15000);
		Actions ob=new Actions(driver);
		
	 /*  WebElement singin_btn=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
       Actions ob=new Actions(driver);
       ob.moveToElement(singin_btn).build().perform();
       
       WebElement recomm_btn=driver.findElement(By.linkText("Recommendations"));
       Actions obr=new Actions(driver);
       ob.moveToElement(recomm_btn).build().perform();
       
       recomm_btn.click(); */
		driver.switchTo().frame(0);
		WebElement dragaable=driver.findElement(By.id("draggable"));
		Thread.sleep(4000);
		WebElement dropable=driver.findElement(By.id("droppable"));
		ob.dragAndDrop(dragaable, dropable).build().perform();
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		
		
		WebElement res_btn=driver.findElement(By.linkText("Resizable"));
		res_btn.click();
		driver.switchTo().frame(0);
		
		WebElement icon=driver.findElement(By.xpath("//*[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
		ob.dragAndDropBy(icon, 200,200).build().perform();
		
       
    
	}

}
