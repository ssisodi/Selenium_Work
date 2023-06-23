package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com");
	
		Thread.sleep(5000);
		
		driver.get("https://www.google.com");
		
		// Difference between Close and Quit() methods
		// Close() method is used to close the current tab only
		
		driver.close(); 
		
		// To close all tabs/ browser open by Selenium. 
		driver.quit(); 
		
		
	}

}
