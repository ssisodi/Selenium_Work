package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Magento {
	/*Test scenario of ordering a jacket from this website https://magento.softwaretestingboard.com/ 
	 * 1.Launch the browser
	 * 2. Maximize the browser  
	 * 3. Navigate to the Men's tab to Jacket tab 
	 * 4. Purchase the Proteus Fitness Jackshirt
	 * 5. Select the XL size and color as Black 
	 * 6. Add the item to cart 
	 * 7. Click the cart to show your purchases
	 * 8. Then click proceed to checkout 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\siddr\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
				
	
	//	ChromeDriver driver = new ChromeDriver(); // Least preferred way
	// With this syntax we will be able to use driver for only Chrome Driver
				
		WebDriver driver = new ChromeDriver(); // Most preferred way
	//With this syntax we will be able to use driver for any driver including chrome. 
		
		//1. Launch browser	
		driver.get("https://magento.softwaretestingboard.com/");
		
		Thread.sleep(5000);
		//2. Maximize the browser  
		driver.manage().window().maximize();
		
		
		//Actions act = new Actions(driver);
		
		
		
		//driver.navigate().to("https://magento.softwaretestingboard.com/men.html");
		
		Thread.sleep(3000);
		
		//driver.navigate().to("https://magento.softwaretestingboard.com/men/tops-men.html");
		
		Thread.sleep(3000);
	
	//	driver.navigate().to("https://magento.softwaretestingboard.com/men/tops-men/jackets-men.html");
		
		driver.findElement(By.xpath("//a[@ class = 'product-item-link'][1]")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div [@ option-label = 'XL']")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div [@ option-label = 'Black']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button [@ title = 'Add to Cart']")).click();	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class = 'action showcart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span [ @ data-role = 'title']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button [@ class = 'action primary checkout']")).click();
	}
}
