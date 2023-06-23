package pack123;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main (String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32_110\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		TakesScreenshot t = (TakesScreenshot)driver;
		Random objGenerator = new Random();
		
		for(int i = 0; i<5;i++)
		{
			int randomNumber = objGenerator.nextInt(100000000);
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\ScreenshotsPractice\\Test_"+randomNumber+".png"); 
		
		FileHandler.copy(src, dest);
			
		}
	}
}
