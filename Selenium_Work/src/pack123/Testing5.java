package pack123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser
 */

public class Testing5 {

	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
	//1) Launch browser	
	//	ChromeDriver driver = new ChromeDriver(); // Least preferred way
		// With this syntax we will be able to use driver for only Chrome Driver
		
		WebDriver driver = new ChromeDriver(); // Most preferred way
		//With this syntax we will be able to use driver for any driver including chrome. 
		
		//2) open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		driver.manage().window().maximize();
	
		Thread.sleep(5000); // 5 Seconds of weight method
				
		//3) Provide username  - Admin
	/*	WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("Admin");*/
		
	/*Another way to write this is:*/ 
		driver.findElement(By.name("username")).sendKeys("Admin");	// Method chaining 
		
		
		//4) Provide password  - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(5000);
		
		//5) Click on Login button 
	driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		/*6) Verify the title of dashboard page   
			Exp title : OrangeHRM*/
	//But to verify if the actual title is equal to the expected title
		
	String act_title = driver.getTitle();
	String exp_title = "OrangeHRM";
	
	if(act_title.equals(exp_title))
	{
		System.out.println("Test passed");
	}
	else 
	{
		System.out.println("Test failed");
	}

 //7) close browser
	//driver.close();// Since its throwing an exception we'll use Quit() method
	driver.quit();
	}
}
