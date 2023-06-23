package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lexus {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\siddr\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); 
	
	driver.get("https://www.lexus.com/"); // WebSite link 	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize(); // Maximizing the URL 
	//HomePage ------------------------------------------------------------------------------------------------------------------------------
	Thread.sleep(5000); 
	
	Actions act = new Actions(driver); 
	WebElement vehicles  = driver.findElement(By.xpath("//button[contains(text(),'VEHICLES')]")); 
	act.moveToElement(vehicles).perform();// Moving mouse over 'Vehicles' tab
	
	Thread.sleep(2000);
	
	WebElement suv = driver.findElement(By.xpath("//div[@data-slideindex = '0']/span"));
	act.moveToElement(suv).click().build().perform();// Moving mouse over the 'SUV' tab 
	
	WebElement sedantab = driver.findElement(By.xpath("//div[@data-slideindex = '1']/span"));
	act.moveToElement(sedantab).click().build().perform(); // Moving mouse over the 'Sedan' tab
	
	Thread.sleep(1000);
	
	WebElement hybridtab = driver.findElement(By.xpath("//div[@data-slideindex = '2']/span"));
	act.moveToElement(hybridtab).click().build().perform(); // Moving mouse over the 'HYBRID & ELECTRIC' tab
	
	Thread.sleep(1000);
	
	WebElement performancetab = driver.findElement(By.xpath("//div[@data-slideindex = '3']/span"));
	act.moveToElement(performancetab).click().build().perform(); // Moving mouse over the 'PERFORMANCE' tab
	
	Thread.sleep(1000);
	
	WebElement futuretab = driver.findElement(By.xpath("//div[@data-slideindex = '4']/span"));
	act.moveToElement(futuretab).click().build().perform();// Moving mouse over the 'FUTURE' tab
	
	Thread.sleep(1000);
	
	act.moveToElement(suv).click().build().perform(); // Again moving back to the first 'SUV' tab
	
	Thread.sleep(1000);
	
	WebElement uxHybrid = driver.findElement(By.xpath("(//a[@aria-label = 'UX HYBRID'])[1]"));
	act.moveToElement(uxHybrid).perform(); // Finding the first box vehicle first
	
	Thread.sleep(1000);
	
	WebElement uxHybridshop = driver.findElement(By.xpath("(//a[contains(text(),'BUILD')])[1]"));
	act.moveToElement(uxHybridshop).click().build().perform(); // Now clicking the build option for the UX Hybrid
//Page - 2 //-----------------------------------------------------------------------------------------------------------------------------
	Thread.sleep(2000);
	
	WebElement zip = driver.findElement(By.xpath("//input[@name = 'zip']"));
	act.moveToElement(zip).click().sendKeys("91801").build().perform();  // adding your PinCode from Alhambra
	
	Thread.sleep(1000);
	
	WebElement searchZip = driver.findElement(By.xpath("//button[contains(text(),'Enter')]"));
	searchZip.click();// Clicking the enter button for PinCode.
	
	Thread.sleep(4000);
//Page - 3 //-----------------------------------------------------------------------------------------------------------------------------			
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	
	js.executeScript("window.scrollBy(0,500)"); //Scrolling down on page 3 till 2023 UX 250h F SPORT DESIGN
	
	Thread.sleep(2000);
	
	WebElement mycar = driver.findElement(By.xpath("(//a[@tabindex = '0']/span)[11]"));
	act.moveToElement(mycar).click().build().perform(); // Clicking the '2023 UX 250h F SPORT DESIGN' all wheel drive
	
	Thread.sleep(3000);
	
	WebElement extColor = driver.findElement(By.xpath("//a/img[@data-code = '02ZG']"));
	act.moveToElement(extColor).click().build().perform(); // Clicking the 'Cloudburst Gray* with Obsidian roof' in exterior color
	
	Thread.sleep(5000);
	
	WebElement nextInt = driver.findElement(By.xpath("//a[contains(text(),'Next: Interior')]"));
	nextInt.click();// Clicking for the 'Next: Interior' to go to the next page.  
//Page - 4 //-----------------------------------------------------------------------------------------------------------------------------					
	Thread.sleep(2000);
	
	WebElement blackNul = driver.findElement(By.xpath("//a/img[@data-code = 'VA20']"));
	act.moveToElement(blackNul).click().build().perform(); // Clicking the Interior color "Black NuLuxe® and Black washi dash trim"
	
	Thread.sleep(1000);
	
	WebElement nextPac = driver.findElement(By.xpath("//a[contains(text(),'Next: Packages')]"));
	nextPac.click(); // Clicking for the 'Next: Packages' to go to the next page.  
//Page - 5 //-----------------------------------------------------------------------------------------------------------------------------				
	Thread.sleep(2000);
	//AUTO-DIMMING REARVIEW MIRROR
	
	WebElement autoDim = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[1]"));
	String actmatch1 = autoDim.getText();
	String expmatch1 = "AUTO-DIMMING REARVIEW MIRROR";
	if(actmatch1.equals(expmatch1))
	{
		driver.findElement(By.xpath("(//a[text() = 'Add'])[1]")).click();
		System.out.println("Item 1 got added");
	}
	else
	{
		System.out.println("Cannot add this option 1");
	}
	
	Thread.sleep(1000);
	//COLOR HEAD-UP DISPLAY
	
	WebElement headup = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[2]"));
	String actmatch2 = headup.getText(); 
	String expmatch2 = "COLOR HEAD-UP DISPLAY"; 
	if(actmatch2.equals(expmatch2))
	{
		driver.findElement(By.xpath("//a[@aria-label='Add COLOR HEAD-UP DISPLAY']")).click();
		System.out.println("Item 2 got added");
	}
	else
	{
		System.out.println("Cannot add this option 2");
	}
	
	Thread.sleep(1000);
	//WIRELESS CHARGER
	
	WebElement wirelessC = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[3]"));
	String actmatch3 = wirelessC.getText(); 
	System.out.println(actmatch3);
	String expmatch3 = "WIRELESS CHARGER*"; 
	if(actmatch3.equals(expmatch3))
	{
		driver.findElement(By.xpath("//a[@aria-label='Add WIRELESS CHARGER']")).click();
		System.out.println("Item 3 got added");
	}
	else
	{
		System.out.println("Cannot add this option 3");
	}
	
	Thread.sleep(1000);
	//INTUITIVE PARKING ASSIST
	
	WebElement intuitPark = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[4]"));
	String actmatch4 = intuitPark.getText(); 
	System.out.println(actmatch4);
	String expmatch4 = "INTUITIVE PARKING ASSIST*"; 
	if(actmatch4.equals(expmatch4))
	{
		driver.findElement(By.xpath("//a[@aria-label='Add INTUITIVE PARKING ASSIST']")).click();
		System.out.println("Item 4 got added");
	}
	else
	{
		System.out.println("Cannot add this option 4");
	}
	
	Thread.sleep(1000);
	//POWER REAR DOOR WITH KICK SENSOR	

	WebElement powerSensor = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[5]"));
	String actmatch5 = powerSensor.getText(); 
	System.out.println(actmatch5);
	String expmatch5 = "POWER REAR DOOR WITH KICK SENSOR"; 
	if(actmatch5.equals(expmatch5))
	{
		driver.findElement(By.xpath("//a[@aria-label='Add POWER REAR DOOR WITH KICK SENSOR']")).click();
		System.out.println("Item 5 got added");
	}
	else
	{
		System.out.println("Cannot add this option 5");
	}	
	
	Thread.sleep(3000);
	//HEATED STEERING WHEEL
	
	
	WebElement heaterWheel = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[6]"));
	String actmatch6 = heaterWheel.getText(); 
	System.out.println(actmatch6);
	String expmatch6 = "HEATED STEERING WHEEL"; 
	if(actmatch6.equals(expmatch6))
	{
		driver.findElement(By.xpath("//a[@aria-label='Add HEATED STEERING WHEEL']")).click();
		
		WebElement footerDriver = driver.findElement(By.xpath("(//footer[@class = 'conflict-foot'])[1]"));
		footerDriver.findElement(By.xpath("//a[contains(text(),'Confirm')]")).click(); 
		System.out.println("Item 6 got added");
	}
	else
	{
		System.out.println("Cannot add this option 6");
	}		
	
	Thread.sleep(2000);
	//WINDSHIELD WIPER DE-ICER
	
	WebElement deicer = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[7]"));
	String actmatch7 = deicer.getText(); 
	System.out.println(actmatch7);
	String expmatch7 = "WINDSHIELD WIPER DE-ICER"; 
	if(actmatch7.equals(expmatch7))
	{
		driver.findElement(By.xpath("//a[@aria-label='Add WINDSHIELD WIPER DE-ICER']")).click();
		System.out.println("Item 7 got added");
	}
	else
	{
		System.out.println("Cannot add this option 7");
	}		
	
	Thread.sleep(3000);
	//HEATED AND VENTILATED FRONT SEATS
	/*
	WebElement heatSeats = driver.findElement(By.xpath("(//ul[@id = 'individualSelectionView']/li//h3)[8]"));
	String actmatch8 = heatSeats.getText(); 
	System.out.println(actmatch8);
	String expmatch8 = "HEATED AND VENTILATED FRONT SEATS"; 
	if(actmatch8.equals(expmatch8))
	{
		driver.findElement(By.xpath("//a[@aria-label='Add HEATED AND VENTILATED FRONT SEATS']")).click();
		System.out.println("Item 8 got added");
	}
	else
	{
		System.out.println("Cannot add this option 8");
	}		
	
	Thread.sleep(2000);*/
	
	WebElement nextAcc = driver.findElement(By.xpath("//a[contains(text(),'Next: Accessories')]"));
	nextAcc.click(); // Clicking the 'Next: Accessories'
//Page - 6 //-----------------------------------------------------------------------------------------------------------------------------				
	Thread.sleep(3000);
					
	WebElement nextSum = driver.findElement(By.xpath("//a[contains(text(),'Next: Summary')]"));
	nextSum.click(); // Clicking the 'Next: Summary'

	Thread.sleep(3000); 
	
}

}

