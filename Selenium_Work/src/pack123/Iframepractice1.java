package pack123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iframepractice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); 
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.manage().window().maximize();		
		
		Thread.sleep(1000); 
		
		WebElement iframe_ref = driver.findElement(By.xpath("//iframe [@name = 'globalSqa']")); 
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(iframe_ref);
		
		WebElement all = driver.findElement(By.xpath("//div[@id = 'portfolio_filter']//span")); 
		all.click();	
		
		//driver.switchTo().defaultContent(); // iframe to main page directly
		driver.switchTo().parentFrame(); // Iframe to immediate page directly
	}
}
