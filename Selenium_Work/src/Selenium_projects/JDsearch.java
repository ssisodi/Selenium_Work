package Selenium_projects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet; // (This is very crucial (Do not use import org.apache.poi.sl.usermodel.Sheet; at all)
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v112.input.Input;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JDsearch {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		System.setProperty("Webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); 
	//	options.addArguments("--remote-allow-origin");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options); 
		
		driver.get("https://www.linkedin.com/feed/");
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	
		Actions act = new Actions(driver); 
		
		WebElement signin = driver.findElement(By.xpath("//a[@class = 'main__sign-in-link']"));  
		act.moveToElement(signin).click().build().perform(); 
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'username']")); 
		email.sendKeys("siddhanths91@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password']")); 
		password.sendKeys("Patron@2023");
		
		//button[contains(text(),'Sign in')]
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")); 
		button.click(); 
		
		Thread.sleep(6000);
		
		
		//li-icon[@type = 'job']
		WebElement jobs = driver.findElement(By.xpath("//li-icon[@type = 'job']"));
		act.moveToElement(jobs).click().build().perform(); 
		
		Thread.sleep(1000); 
		
		WebElement searchkeyword = driver.findElement(By.xpath("(//div[@class = 'relative']//input)[1]"));
		searchkeyword.click(); 
		Thread.sleep(1000);
		searchkeyword.sendKeys("QA Automation Tester"); 
		Thread.sleep(1000);
		searchkeyword.sendKeys(Keys.RETURN); 
		
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.xpath("//input[contains(@id,'jobs-search-box-location-id-ember')]")); 
		city.click();
		city.clear(); 
		city.sendKeys("Pune"); 
		city.sendKeys(Keys.RETURN); 
		
		Thread.sleep(5000); 
		
		WebElement dateposted = driver.findElement(By.xpath("//button[@aria-label = 'Date posted filter. Clicking this button displays all Date posted filter options.']"));
		act.moveToElement(dateposted).click().build().perform();
		Thread.sleep(2000);
		
		WebElement choosedate = driver.findElement(By.xpath("(//input[@name = 'date-posted-filter-value'])[3]"));
		act.moveToElement(choosedate).click().perform(); 
		Thread.sleep(1000);
		
		WebElement showres = driver.findElement(By.xpath("(//button[contains(@id,'ember')])[8]")); 
		act.moveToElement(showres).click().build().perform(); /*
		
		driver.get("https://www.microsoft.com/en-in/microsoft-365/excel?ms.officeurl=excel&rtc=1");
		
		driver.manage().window().maximize(); 
		
		
		WebElement micros = driver.findElement(By.xpath("//div[@id = 'mectrl_headerPicture']")); 
		act.moveToElement(micros).click().build().perform(); 
		
		//input[@id = 'i0116']
		WebElement sign = driver.findElement(By.xpath("//input[@id = 'i0116']")); 
		sign.click(); 
		sign.sendKeys("siddriven@gmail.com"); 
		
		//input[@id ='idSIButton9']
		WebElement next = driver.findElement(By.xpath("//input[@id ='idSIButton9']"));
		next.click(); 
		Thread.sleep(2000); 
		
		//input[@id = 'i0118']
		WebElement passw = driver.findElement(By.xpath("//input[@id = 'i0118' and @type = 'password']")); 
		passw.sendKeys("Jaiguruma");
		
		
		WebElement signMicro = driver.findElement(By.xpath("//input[@id ='idSIButton9' and @type = 'submit']"));
		signMicro.click(); 
		
		WebElement noMicro = driver.findElement(By.xpath("//input [@id = 'idBtn_Back']")); 
		noMicro.click(); 
		
		Thread.sleep(3000);
		
		WebElement uselesscontinue = driver.findElement(By.xpath("//button[contains(@class, 'ms-Button ms-Button--primary root')]//span/span")); 
		act.moveToElement(uselesscontinue).click().build().perform(); 
		uselesscontinue.sendKeys(Keys.RETURN); 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
				
		WebElement excel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id ='ms-searchux-input-0']")));
		excel.sendKeys("Jobpage"); 
		excel.click();
		excel.sendKeys(Keys.RETURN);
		
		WebElement jobpage = driver.findElement(By.xpath("(//div[contains(text(),'Jobpage')])[1]")); 
		act.moveToElement(jobpage).click().build().perform(); 		
		
		Thread.sleep(1000);
		*/
		String path = "C:\\Users\\siddr\\OneDrive\\Documents\\Jobpage.xlsx"; 
		
		InputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet_loc = book.getSheet("Jobtype1"); 
		
		Row row = sheet_loc.getRow(1);
		
		int last_cell = row.getLastCellNum(); // Getting the last cell number from the row number 3 
		System.out.println("The lastcell number is: "+last_cell); // 2

		
		
		
		
		

		
		/*
		WebElement exceldomain = driver.findElement(By.xpath("//div[contains(@aria-label,'App result')]")); 
		act.moveToElement(exceldomain).click().build().perform(); 
		
		WebElement joblist = driver.findElement(By.xpath("//div[contains(text(), 'Joblist')]")); 
		act.moveToElement(joblist).click().build().perform();
		
		 "C:\Users\siddr\OneDrive\Documents\Jobpage.xlsx"

        */	
		
	}

}
