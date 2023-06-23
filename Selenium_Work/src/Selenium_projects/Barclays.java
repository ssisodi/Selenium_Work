package Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Test scenario for Banking website
 * 1) Accept all the cookies. 
 * 2) Select the 'Other Barclays sites' 
 * 3) Now open 4 links - Personal banking, 
 * 	Corporate banking, Business banking, International banking 
 * 4) On the main page, do the following tasks 
 * {	Select the 'investors' tab 
Share price and calculator
Scroll down the page till share price chart 
Selecting 6Mo under History tab 
Selecting the drop down of start date 
Selecting the dropdown of month and year
Selecting the dropdown of end date
Selecting the dropdown of month and year
Then selecting the go tab
Scroll down to comparative data 
Checking the checkboxes of Peer Group - Stock Exchanges.}
 * */

public class Barclays {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\siddr\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://home.barclays/");
		
		driver.manage().window().maximize(); // Maximized the window
		
		Thread.sleep(5000); //Time lag for accepting the cookies manaully [Shadow DOM encountered]

		String mainpage = driver.getWindowHandle(); 
		System.out.println(mainpage);// to get the address of home page
		
		/*Set<String> a = driver.getWindowHandles();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());*/
		
		
		Actions act = new Actions(driver); // Mouse click action declared.
		
		WebElement otherwebs = driver.findElement(By.xpath("//a[text() ='Other Barclays sites']")); // Xpath for 'Other Barclays Sites'
		act.moveToElement(otherwebs).perform(); 
	
		Thread.sleep(3000); 
	
		WebElement personalW = driver.findElement(By.xpath("//a[contains(text(),'Personal Banking')]"));
		WebElement businessW = driver.findElement(By.xpath("//a[contains(text(),'Business Banking')]"));
		WebElement corporateW = driver.findElement(By.xpath("( //a[contains(text(),'Corporate Banking')])[1]"));
		WebElement investW = driver.findElement(By.xpath("( //a[contains(text(),'Investment Bank')])[1]"));
		WebElement tabinvest = driver.findElement(By.xpath("//a[text() = 'Investors']"));
		WebElement shareprice = driver.findElement(By.xpath("//a[contains(text(),'Share price ')]"));
		
		act.moveToElement(personalW).click().build().perform();	// Personal banking webpage is clicked  
		Thread.sleep(1000);
		driver.switchTo().window(mainpage); // Switch back to Homepage
		act.moveToElement(otherwebs).perform(); // Moving mouse pointer on  'Other Barclays Sites'
		
		Thread.sleep(1000); 
		act.moveToElement(businessW).click().build().perform(); // Business banking webpage is clicked
		driver.switchTo().window(mainpage);// Switch back to Homepage
		act.moveToElement(otherwebs).perform();
		
		Thread.sleep(1000); 
		act.moveToElement(corporateW).click().build().perform(); // Corporate banking webpage is clicked
		driver.switchTo().window(mainpage); // Switch back to Homepage
		act.moveToElement(otherwebs).perform();
		
		Thread.sleep(1000); 
		act.moveToElement(investW).click().build().perform(); // Investment banking webpage is clicked
		driver.switchTo().window(mainpage);// Switch back to Homepage
		//act.moveToElement(otherwebs).perform();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		js.executeScript("window.scrollBy(759, 3013)");
		
		Thread.sleep(5000);
		//button[contains(text(),'More Stories')]
		driver.findElement(By.xpath("//button[contains(text(),'More Stories')]")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(759, 800)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'More Stories')]")).click();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(759, -5013)");		
		
		Thread.sleep(2000);
		
		act.moveToElement(tabinvest).perform(); // Navigation 
		
		Thread.sleep(2000);
		
		act.moveToElement(shareprice).click().build().perform(); 
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1800)");
		
		
		
	}
}
