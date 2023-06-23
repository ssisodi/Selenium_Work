package Doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//	ChromeDriver driver = new ChromeDriver(); // Least preferred way
		// With this syntax we will be able to use driver for only Chrome Driver
					
			WebDriver driver = new ChromeDriver(); // Most preferred way
		//With this syntax we will be able to use driver for any driver including chrome. 
					
			//1.Launch browser	
			driver.get("https://www.amazon.in/s?k=cellphone&crid=26DWN8LHYL3MU&sprefix=cellphon%2Caps%2C244&ref=nb_sb_noss_2");
			
			driver.manage().window().maximize();
//
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//div[@data-index = '2']//div)[7]")).click();
			
	}

}
