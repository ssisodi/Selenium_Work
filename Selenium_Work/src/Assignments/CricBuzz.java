package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CricBuzz {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.cricbuzz.com/"); 
		
		driver.manage().window().maximize(); 
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000); 
		
		WebElement series = driver.findElement(By.xpath("//a[text() = 'Series']"));
		act.moveToElement(series).perform(); 
		
		Thread.sleep(2000); 
		
		WebElement ipl = driver.findElement(By.xpath("//a[@title = 'Bangladesh Premier League 2023']")); 
		act.moveToElement(ipl).click().build().perform();
		
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//a[text() ='Points Table']")).click(); 
	
		Thread.sleep(2000); 
		
		String path = "G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\ExcelSheet_Practice.xlsx"; 
	
		InputStream file = new FileInputStream(path); 
		
		Workbook book = WorkbookFactory.create(file); 
		
		Sheet sheet_loc = book.getSheet("Points Table");
	
		for (int i = 1; i<=7;i++)
		{
			WebElement firstteam = driver.findElement(By.xpath("(//div[@class= 'cb-col cb-col-84'])["+i+"]"));
			String result =firstteam.getText();
			System.out.println(result);
			
			Row row = sheet_loc.getRow(1);
			row.getCell(0).setCellValue(result);
					
		}	
		
	}

}
