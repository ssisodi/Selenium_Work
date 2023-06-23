package Doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default 
		
		driver.get("https://www.flipkart.com/");
		driver.close(); // Closing the current URL 
				
		Thread.sleep(10000); // 10 Sec
		//(//button [contains(@class ,'_2KpZ6l _')])[1]
		
		driver.findElement(By.xpath("(//button [contains(@class ,'_2KpZ6l _')])[1]")).click();
	}
}
/*Synchronization 
 * - Will create problems for Close() method
 * - Thread sleep dependent 
 * 
 * Quit() method -- Closes all the tabs 
 * 
 * */