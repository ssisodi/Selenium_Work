package pack123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*In attempt to click 'Try it' button on W3schools, we're getting 
*error as noSuchElement and that is happening because of IFrame*/
public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
								
		//Browser is launched at object creation 
		WebDriver driver = new ChromeDriver(options); // private // Default
				
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		Thread.sleep(3000);
		//How to handle IFrame
		
/*1.First we need to change the focus of Selenium
*to IFrame using the "driver.switchto().frame(int index)[WebDriver - TargetLocator]"
*in this the main window is seperate from the Iframe window 
*and that's why we use the driver.switchto.frame(int index)*/ 

//-------------------------------------------------------------------------------------------		
/*driver.switchTo().frame(3);

Index number 3 comes from //Iframe search on DOM. 
The index value as an argument is not so accurate while selecting the correct Iframe.*/

//-------------------------------------------------------------------------------------------
/*driver.switchTo().frame("iframeResult");

Passing 'id' attribute value 'IframeResult' 
iframeResult is comes from the id attribute of Iframe*/
		
//--------------------------------------------------------------------------------------------
//frame_ref webelement reference that returns the Xpath of Iframe.  		
	WebElement frame_ref = driver.findElement(By.xpath("//iframe [@id = 'iframeResult']"));
/*Switch from current frame to its iframe. 
 * Passing frame_ref as parameter to frame()*/  
	
	driver.switchTo().frame(frame_ref);
	
	WebElement tryit =	driver.findElement(By.xpath("//button[text()='Try it']"));
	
	tryit.click();
	
/*2. Second suppose we need to click the 'Get your website'
 * green tab, so we need to move out our selenium focus 
 * from Iframe to main window, and it is possible with 
 * below syntaxes*/
	
	driver.switchTo().parentFrame();
/*With parentframe() we can switch from current iFrame to immediate frame.*/
	
	//OR
	
/*Switch from any Iframe to main page directly*/
	driver.switchTo().defaultContent();
	}
}
