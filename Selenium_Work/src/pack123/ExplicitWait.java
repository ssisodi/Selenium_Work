package pack123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\siddr\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000); 
												//maximum waiting time
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Use this one 
		//In newer version, we have added Duration.ofSeconds to add unit ot it. 
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("input[@id='pass']")));

	}

}
