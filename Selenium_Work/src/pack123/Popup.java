package pack123;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
				
		//browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default 
				
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type = 'submit']")); // Xpath of submit button 
		submit.click();
		
		//driver.findElement(By.xpath("//a[text()='Insurance Project']")).click();
				
		Alert alt = driver.switchTo().alert();
		/*Point 1: 
		 *First we have to change the focus of selenium from main page to the alert popup page.
		 *For this we use the code "driver.switchTo().alert()"
		 * 
		 *Point2: 
		 *".alert()" return type is bringing object of implementation class of 'Alert' interface. 
		 *So, in method chaining, the object of alert() is returned from implementation class.  */
		
		/*Below is one way to access the methods using 'alt' as reference.*/
		String result = alt.getText(); //Getting the alert written in alert box 
		System.out.println(result);
		alt.accept(); // Accepting the alert 'ok' button 
		//OR
		
		Thread.sleep(1000);
		/*Another way to access the method is through method chaining without the use of reference.*/
		driver.switchTo().alert().accept();
		
		
//----------------------------------Homework--------------------------------------------------		
		alt.dismiss();/*Wire the alert popup code even when alert pop up is not present*/
		
		
	}

}
