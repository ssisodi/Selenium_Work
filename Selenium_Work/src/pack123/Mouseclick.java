package pack123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {

	public static void main(String[] args) throws InterruptedException {
		
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
				System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
				
				//browser is launched at object creation 
				WebDriver driver = new ChromeDriver(); // private // Default 
				
				driver.get("https://www.hollisterco.com/shop/wd");
				
				driver.manage().window().maximize();
				
				WebElement Jerry = driver.findElement(By.xpath("//a[@id = 'cat-label-130737']"));
				WebElement Tweety = driver.findElement(By.xpath("(//a[text()='Jogger'])[1]"));			
				// How to perform Mouse action 
				
				Actions act = new Actions(driver);
				
				
				act.moveToElement(Jerry).perform();// Navigation method 'movetoelement'
				Thread.sleep(2000);
				act.contextClick().click().perform();
				Thread.sleep(2000);
				act.moveToElement(Tweety).perform();
				Thread.sleep(2000);
				act.click().perform(); // Left click on mouse and perform method to perform the mouse action. 
							
	}
	

}
