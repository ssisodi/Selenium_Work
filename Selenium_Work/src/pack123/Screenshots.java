package pack123;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//Browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default
						
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
// How to capture the screenshot in selenium 
		
		TakesScreenshot t = (TakesScreenshot)driver; 
/*Line19: Chromedriver is upcasted in to TakesScreenshot. 
 * Meaning the reference of chromedriver that is 'driver' is 
 * written with casting operator(TakesScreenshot) and then 
 * store it in 't'. */		

//Step - 1		
		File src = t.getScreenshotAs(OutputType.FILE);
// This method is to capture a screenshot of the screen like printscreen button
// Now that we have taken the screenshot, we have to save the screenshot at some location
// Only visible area of the application in the browser is captured. 
		
//Step - 2		
		File dest = new File("C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\Screenshot_Practice folder\\test123.png");
//'File' class is used to store the screenshot at set address location
// But, we haven't set a name to the screenshot file, so we write \\test123 as a name to the screenshot. 
// This test123.png file is now blank and doesn't have data in it. So, we have to copy data from 'src' to 'dest'. 

//Step - 3
		FileHandler.copy(src, dest);
//With the help of FileHandler method we can copy the data from'src' to 'dest'	
		
/*How to save multiple screenshots
	for(int i = 1;i<6;i++)
	File dest1 = new File("C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\Screenshot_Practice folder\\test"+i+".png");
*/
//******Assignement************		
/*Image name -> Random number - google it
 * Test-561651698541651*/
		
/*Image name - current date and time - google it-> how to get the system date in java 
 * Test -  */
		
		
		
	}

}
