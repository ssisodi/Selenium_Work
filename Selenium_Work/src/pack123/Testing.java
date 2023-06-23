package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing 
{
	public static void main(String[] args) throws InterruptedException 
	{
	//Configuring the system properties of Chrome driver BUT browser is not launched at this step
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
	
	//browser is launched at object creation 
	WebDriver driver = new ChromeDriver(); // private // Default 
	
	driver.get("https://www.facebook.com");
	
	Thread.sleep(5000);
	
	driver.navigate().to("https://www.google.com");
	
	Thread.sleep(5000);
	
	driver.navigate().back();

	Thread.sleep(5000);
	
	driver.navigate().forward(); 
	
	Thread.sleep(5000);
	//Method chaining
	driver.manage().window().maximize();// We can maximize the browser in Selenium with the help of method maximize().
	
	Thread.sleep(5000);
	
	driver.manage().window().minimize(); // We can minimize the browser in Selenium with the help of method minimize().
	/*Interview question on maximize and Minimize()
	 * Q) How to minimize the browser? 
	 * In last older version of Selenium(3.141.59 version), there were no method as minimize() so, we could not minimize the browser. 
	 * But, In newer version of Selenium(4.0.0) in 2021, we can minimize using  driver.manage().window().minimize();
	 */	
	
	}
}
 