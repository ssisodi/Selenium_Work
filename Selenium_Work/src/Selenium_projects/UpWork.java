package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpWork {

	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\siddr\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
						
			//	ChromeDriver driver = new ChromeDriver(); // Least preferred way
			// With this syntax we will be able to use driver for only Chrome Driver
						
				WebDriver driver = new ChromeDriver(); // Most preferred way
			//With this syntax we will be able to use driver for any driver including chrome. 
//-------------------------------------------------------------------------------------------------------------------------------------------------------
//HOME PAGE WebElements 
					
				driver.get("https://www.upwork.com/");//1.Launch browser
				
				Thread.sleep(2000);
				
				driver.manage().window().maximize();//2.Maximize the browser  
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[@id = 'onetrust-accept-btn-handler']")).click();//3.The sites for cookies ---click the 'Accept all'  
				
				Thread.sleep(3000);
				
				JavascriptExecutor js = (JavascriptExecutor)driver; // JavaScript executor declared for scrolling
				
				js.executeScript("window.scrollBy(0, 1050)"); // Scrolling to "To find good companies"
				
				Thread.sleep(2000); 
				
				js.executeScript("alert('Click on learn more if you want to find good companies')"); // Alert popup on "To find good companies"
				
				Thread.sleep(2000);
				
				driver.switchTo().alert().accept(); // Clicking 'ok' on the alert popup of "To find good companies"
				
				Thread.sleep(1000);
								
				js.executeScript("window.scrollBy(0, 650)"); // Scrolling to "Find talent your way"
				
				Thread.sleep(2000);
				
				js.executeScript("alert('Wanna find new talent, go ahead ! choose one amongst three')"); // Alert popup on "Find talent your way" 
				
				Thread.sleep(2000);
				
				driver.switchTo().alert().accept();// Clicking 'ok' on the alert popup of "Find talent your way"
				
				Thread.sleep(2000);
				
				js.executeScript("window.scrollBy(0, 1400)"); // Scrolling to "Find great work"
				
				Thread.sleep(2000);
				
				js.executeScript("alert('Want to find more opportunities?? Wait follow me')");// Alert popup on "Find great work"
				
				Thread.sleep(2000);
				
				driver.switchTo().alert().accept(); // Clicking 'ok' on the alert popup of "Find great work"
				
				Thread.sleep(2000);
				
				Actions act = new Actions(driver); // Mouse action object creation
				WebElement Findw = driver.findElement(By.xpath("(//button[@type='button' and @tabindex='3'])[10]/span")); // Find work tab
				act.moveToElement(Findw).perform(); // Moving mouse to the element of 'Find Work'
				
				WebElement ways = driver.findElement(By.xpath("(//a[@role = 'menuitem'])[24]/strong"));
				//Webelement 'Ways to earn' xpath 
				act.moveToElement(ways).click().build().perform(); // Moving over the element 
//-------------------------------------------------------------------------------------------------------------------------------------------
// Page 2 - Ways to earn 
				js.executeScript("window.scrollBy(0,600)");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,200)");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(1000);
				WebElement CreateProfile = driver.findElement(By.xpath("//div[@id = 'btn-2']"));
				CreateProfile.click();
				
				Thread.sleep(3000);
//-------------------------------------------------------------------------------------------------------------------------------------------
// Page 3 - Choosing amongst two options "Join as a client or FreeLancer"
				
				/*WebElement ClientOption = driver.findElement(By.xpath("(//div [@value = 'work']//span)[1]"));
				ClientOption.click();*/ 
				
			//	Thread.sleep(1000);
				
				js.executeScript("alert('Choose Freelance option(Recommended)')");
				
				Thread.sleep(1000);
				
				driver.switchTo().alert().accept();
				
				WebElement ApplyOption = driver.findElement(By.xpath("//button[contains(text(),'Apply as a ')]"));
				ApplyOption.click(); 
//-------------------------------------------------------------------------------------------------------------------------------------------
//Page 4 - Sign up to find work you love
				
				Thread.sleep(1000); 
				
				WebElement firstName = driver.findElement(By.xpath("//input [@id ='first-name-input']"));
				firstName.sendKeys("Siddhanth"); 
				
				Thread.sleep(1000); 
				
				WebElement lastName = driver.findElement(By.xpath("//input [@id ='last-name-input']"));
				lastName.sendKeys("Sisodia"); 
				
				Thread.sleep(1000); 
				
				WebElement email = driver.findElement(By.xpath("//input [@id ='redesigned-input-email']"));
				email.sendKeys("sisodiasiddhanth@gmail.com"); 
				
				Thread.sleep(1000); 
				
				WebElement password = driver.findElement(By.xpath("//input [@id ='password-input']"));
				password.sendKeys("P@ssW0rD");
				
				Thread.sleep(1000);
				
				/*WebElement country = driver.findElement(By.xpath("//div[@id ='dropdown-label-5']"));
				country.click(); */
				
				js.executeScript("alert('Looks like you already have an account. Login then!')");
				
				Thread.sleep(1000);
				
				driver.switchTo().alert().accept();
				
				//a[contains(text(),'Want to log in?')]
				WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Want to log in?')]"));
				login.click(); 
				
//-------------------------------------------------------------------------------------------------------------------------------------------
//Page 5 - Login page 

				WebElement userName = driver.findElement(By.xpath("//input [@id = 'login_username']"));
				userName.sendKeys("sisodiasiddhanth@gmail.com"); 
				
				driver.close();
				
				}
	}
