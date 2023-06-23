package Doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
				System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
				
				//browser is launched at object creation 
				WebDriver driver = new ChromeDriver(); // private // Default 
				
			//	JavascriptExecutor js = (JavascriptExecutor) driver;
				
				driver.get("https://www.hollisterco.com/shop/wd/mens-t-shirts-and-henleys-tops?filtered=true&rows=90&start=0");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
//				WebElement Element = driver.findElement(By.xpath("//ul[@aria-labelledby = 'p_n_feature_nineteen_browse-bin-title']"));
//			
//				js.executeScript("arguments[0].scrollIntoView();", Element);
				driver.findElement(By.xpath("//button[@id = 'colorFamily-large-screen']")).click();
			
				Thread.sleep(5000);
				// Click multiple checkboxes  //ul[@aria-labelledby = 'p_n_feature_nineteen_browse-bin-title']/li[]/span/a/div/label/input
				driver.findElement(By.xpath("//input[@id='colorFamily-large-screen-black-1']")).click();
				//System.out.println("Total number of Checkboxes: "+ Checkbox.size());
//				System.out.println(Checkbox);
				
				// Select all the checkboxes
				/*At a time we cannot just click all the checkboxes with individual Xpaths, we have to use looping statements*/
//			for(int i = 0; i<Checkbox.size(); i++)
//				{
//					WebElement ListEle = driver.findElement(By.xpath("//ul[@aria-labelledby = 'p_n_feature_nineteen_browse-bin-title']/li"));
//					
//					Checkbox.get(i).click();
//				}
			}
}
//driver.findElement(By.xpath("// button[contains (@ class, 'barclays-gdpr__accept')]")).click();

/*// Clicking only single Checkbox
driver.findElement(By.xpath("(//div [contains (@ class,' a-checkbox')])[4]")).click();*/


