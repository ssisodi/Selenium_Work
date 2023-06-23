package Doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rushikesh {

	public static void main(String[] args) throws InterruptedException {
		
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
								
		//browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default
		
		driver.get("https://demoqa.com/elements");
		Thread.sleep(3000);

		WebElement check = driver.findElement(By.xpath("//span[text()='Check Box']"));
		check.click();
		
		Thread.sleep(3000);

		WebElement box = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		

		boolean result = box.isSelected();

		if (result == true)
		{
		System.out.println(result);
		System.out.println("selected");
		}
		else
		{
		System.out.println(result);
		System.out.println("not selected");
		box.click();
		}
		
		Thread.sleep(2000);
		
		result = box.isSelected();
		System.out.println(result);
		}
}
