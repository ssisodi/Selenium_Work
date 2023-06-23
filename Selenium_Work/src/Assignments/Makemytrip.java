package Assignments;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;



public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); 
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize(); 
		
		Thread.sleep(10000); 
		
		WebElement login = driver.findElement(By.xpath("(//ul[@class ='userSection pushRight']//li)[4]"));
		login.click(); 
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'username']"));
		email.sendKeys("ssisodia226@gmail.com");
		
		WebElement text = driver.findElement(By.xpath("//li[contains(text(),'Personal Account')]"));
		System.out.println(text.getText()); 
		
		driver.quit(); 
		
				
		
		
		

	}

}
