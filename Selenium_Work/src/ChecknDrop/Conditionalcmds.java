package ChecknDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcmds {
/*Conditional Commands
1) isDisplayed()
2) isEnabled()
3) isSelected()

NOTE: These conditional commands are accessed through web elements and not through driver instance.
It will always return Boolean value - True/False*/
	public static void main(String[] args) throws InterruptedException {
		
				//Configuring the system properties of Chrome driver BUT browser is not launched at this step
				System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
				
				//browser is launched at object creation 
				WebDriver driver = new ChromeDriver(); // private // Default 
				
				driver.get("https://home.barclays/ ");
				
				driver.manage().window().maximize();
				
				//Logo displayed or not
				WebElement result = driver.findElement(By.xpath("//span [@class = 'icon icon-barclays-wordmark logo-title']"));
				System.out.println("Logo display status: " + result.isDisplayed());
				// Same thing we can write using method chaining concept
				driver.findElement(By.xpath("//span [@class = 'icon icon-barclays-wordmark logo-title']")).isDisplayed();
				
				
//-------------------------------------------------------------------------------------------------------------------------------------
				//Search is displayed.
				WebElement result1 = driver.findElement(By.xpath("//a[@class = 'aem-search-bar__button']"));
				System.out.println("Search displayed status: " + result1.isDisplayed());
				/*// Same thing we can write using method chaining concept
				driver.findElement(By.xpath("//a[@class = 'aem-search-bar__button']")).isDisplayed();*/
				
				Thread.sleep(5000);
				
				//Search is enabled
				WebElement result2 = driver.findElement(By.xpath("//a[@class = 'aem-search-bar__button']"));
				System.out.println("Search is enabled: " + result2.isEnabled());
				/*// Same thing we can write using method chaining concept
				boolean dom = driver.findElement(By.xpath("//a[@class = 'aem-search-bar__button']")).isEnabled();
				System.out.println("Using method chaining isEnabled: " + dom);*/
							
//-------------------------------------------------------------------------------------------------------------------------------------
				System.out.println("**********Amazon Website************");
				
				driver.get("https://www.amazon.in/s?k=white+shirt+for+men&sprefix=white+shirt%2Caps%2C214&ref=nb_sb_ss_ts-doa-p_1_11");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//div [contains (@ class,' a-checkbox')])[3]")).click();
				
				Thread.sleep(2000);
								
				boolean result3 = driver.findElement(By.xpath("((//div [contains (@ class,' a-checkbox')])[3]")).isSelected();
				System.out.println("Checkbox is selected: " + result3);
				
				driver.manage().window().minimize();
								
				/*// Same thing we can write using method chaining concept
				boolean dom1 = driver.findElement(By.xpath("(//div [contains (@ class,' a-checkbox')])[4]")).isSelected();
				System.out.println("Using method chaining isSelected: " + dom1);*/
				
				
	}

}
