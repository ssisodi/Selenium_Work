package pack123;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Implicitywait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origin");
		
		//Browser is launched at object creation 
		WebDriver driver = new ChromeDriver(options); // private // Default
		
		// Implicit wait -- 3.141.59 version
									// deprecated methods
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
/* The implicitwait(long time, Timeunit unit) is used in selenium version less than 4.0.0. 
 * There are two parameters it takes as input 'long time' and 'Timeunit unit'. 
 * 'long time' is for setting time for example 10 seconds, so we will write it as below 
 *  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
 *  Here, 10 seconds is written as 10 - 1parameter and TimeUnit.Seconds as the Timeunit unit. 
 *  But, after the parameters are set the ImplicitWait method gets deprecated by selenium library. 
 *  Instead we change the method to 'ImplicitWait(Duration duration)
 */		
		//Implicit wait -- 4.0.0  version					
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(1000);
		
		/*Implicit wait is for dealing with NoSuchElement Exception
		 * It will try searching the element in number of attempts.*/
		 
	/*Implicit wait assignment: 
	 * In the 6 automation links, comment out the Thread.sleep() method and 
	 * add the implicit wait to the program and see what happens.*/	
	}
}
