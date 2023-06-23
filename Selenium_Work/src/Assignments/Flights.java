package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.Select; 

public class Flights {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32_test\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); 
		
		driver.get("https://blazedemo.com/index.php"); 
		
		driver.manage().window().maximize(); 
		
		WebElement title = driver.findElement(By.xpath("(//div[@class ='container'])[2]//h1"));
		String actualtext1 = title.getText();
		
		String exptext1 = "Welcome to the Simple Travel Agency!"; 
		
		if(actualtext1.equals(exptext1))
		{
			System.out.println("Title is displayed as expected");
		}
		else 
		{
			System.out.print("Title is not displayed as expected"); 
		}
//========================================================================================================================
		
				
		WebElement hyperl = driver.findElement(By.xpath("//a[contains(text(),'destination of the week! The Beach!')]"));
		hyperl.click(); 
		
		String output = driver.getCurrentUrl();
		
		System.out.println("The URL contains 'vacation' word: "+ output.contains("vacation")); 
		
		Thread.sleep(2000); 
		
		driver.navigate().back(); 
//========================================================================================================================
		
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@name = 'fromPort' and @class = 'form-inline']")); 
	
		Select dropsrc = new Select(drop1); 
		
		dropsrc.selectByValue("Mexico City");
		
		Thread.sleep(1000); 
		
		WebElement drop2 = driver.findElement(By.xpath("//select[@name = 'toPort' and @class = 'form-inline']"));
		
		Select dropdest = new Select(drop2); 
		
		dropdest.selectByValue("London"); 
		
		WebElement findflight = driver.findElement(By.xpath("//input[@type='submit']")); 
		findflight.click(); 
//========================================================================================================================	
		
		for(int i=0;i<5;i++)
		{
		
		WebElement price =  driver.findElement(By.xpath("//tr["+i+"]/td[6]"));
		System.out.println(price); 
		}
		
		
}
}

