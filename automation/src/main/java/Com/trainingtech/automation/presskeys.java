package Com.trainingtech.automation;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class presskeys {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(); //open the browser
		//driver.get("https://www.google.com"); //website is opening
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Actions ob=new Actions(driver);
		Thread.sleep(2000);
		
		
		//using Gemini to learn how to scroll down a page using different options

		//WebElement learn=driver.findElement(By.linkText("Learn CSS"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", learn); // use it to scroll down a specific element
		//learn.click();
		
	 // JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Scroll to bottom
	//	js.executeScript("window.scrollBy(0, 1000)"); // Scroll down by 250 pixels
		
	/*	WebElement search=driver.findElement(By.id("search2"));
		search.sendKeys("java coding");
		
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(2000);
		ob.sendKeys(Keys.BACK_SPACE).build().perform();  */
		
		
		
		//below code is for google search
		
		//WebElement search=driver.findElement(By.name("q"));
		//search.sendKeys("computer");
		//Thread.sleep(2000);
		//search.sendKeys(Keys.ARROW_DOWN); //to select from the drop down search list
		//search.sendKeys(Keys.ARROW_UP);
		
		//search.sendKeys(Keys.ENTER);
		
	/*	Set<String> nameofSet= new HashSet<>();
		nameofSet.add("Ali");
		nameofSet.add("baizar");
		nameofSet.add("mohsin");
		System.out.println(nameofSet);
		
		Set<String> nameTreeSet= new TreeSet<>();
		nameTreeSet.add("a");
		nameTreeSet.add("c");
		nameTreeSet.add("b");
		System.out.println(nameTreeSet);	
		
		Set<String> nameLinkedHashSet= new LinkedHashSet<>();
		nameLinkedHashSet.add("a");
		nameLinkedHashSet.add("c");
		nameLinkedHashSet.add("b");
		System.out.println(nameLinkedHashSet);	*/
		
		/* Thread.sleep(8000);
		Set<String> WindowHandles = driver.getWindowHandles();
		System.out.println(WindowHandles);
		Iterator<String> hh = WindowHandles.iterator();
		
		System.out.println(hh.next());
		driver.switchTo().window(hh.next());
		driver.close();
		
		System.out.println(hh.next());
		System.out.println(WindowHandles); */
		
		
		WebElement link = driver.findElement(By.linkText("Not Sure Where To Begin?")); 
		Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform(); 
        
        Set<String> allWindows = driver.getWindowHandles();
        driver.switchTo().window(allWindows.toArray(new String[allWindows.size()])[allWindows.size() - 1]); 

		
		
		
		
		
		

	}

}
