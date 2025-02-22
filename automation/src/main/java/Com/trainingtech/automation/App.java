package Com.trainingtech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 */
public class App {
	public static WebDriver mydriver;
	
    public static void main(String[] args) {
    	
        System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amina\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
        mydriver=new ChromeDriver();    
    
    }
}
