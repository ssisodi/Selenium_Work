package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.chrome.driver", "C:\\Users\\siddr\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000); 

		//Fluent wait --> Waiting time + Condition + Frequency
		
	//	Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
/*Here, 'Wait' in an interface with Implementation class as FluentWait() with browser driver as reference*/
				
		
	}

}
