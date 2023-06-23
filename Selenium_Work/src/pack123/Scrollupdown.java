package pack123;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {

	public static void main(String[] args) throws InterruptedException {
		
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default 
		
		driver.get("https://home.barclays/who-we-are/our-strategy/performance-measures/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		// How to perform scroll up and down 
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		/*Here, the JavascriptExecutor is an interface in which "window.scrollBy" is the JavaScript method instruction 
		 * which is executed with the help of executeScript() method from selenium*/
		
		js.executeScript("window.scrollBy(0,3000)"); //Scroll down Pixels //(0, +ve vertical)
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000)"); //Scroll up Pixels//(0, -ve vertical)
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(3000,0)"); //Scroll right Pixels//(+ve horizontal, 0)
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(-2000,0)"); //Scroll left Pixels//(-ve horizontal, 0)	

		// Scrolling until target web element is not displayed on screen. 
		
		WebElement para = driver.findElement(By.xpath("(//a[@role = 'button'])[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",para); 
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-100)");
		
		
		
		
		
		
	
	
	}
}
