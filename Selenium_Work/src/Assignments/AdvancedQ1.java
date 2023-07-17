package Assignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*1. Is there a way to type in a textbox without using sendKeys()?
 * Answer> 1. Is there a way to type in a textbox without using sendKeys()? 
you can use Javascript Executer to input text into a text box without using sendKeys() method*/


public class AdvancedQ1 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origin"); 
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize(); 
		
		//input[@id='Form_submitForm_EmailHomePage']
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('Form_submitForm_EmailHomePage').value = 'siddriven@gmail.com'");
		
		
		
		driver.quit(); 
		
		
		

	}

}
