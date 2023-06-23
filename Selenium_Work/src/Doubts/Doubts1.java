package Doubts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubts1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jeevansathi.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//div[@class='fl hpwid3 lh63 txtc disp-tbl cursp']"));
		
		login.click();
		
		Alert alt = driver.switchTo().alert();
		
		driver.findElement(By.xpath("//input[@id='email' and @name ='email']")).sendKeys("mane.ruturaj4@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mh10@u1140");

	}

}
