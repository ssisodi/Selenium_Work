package pack123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Excelassign3 {
				
			
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//Browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default
							
		driver.get("https://www.w3schools.com/html/html_tables.asp");	
				
		Thread.sleep(3000);
				
	//	List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'customers']//tr//td"));
		
		String path = "C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\Selenium_Practice folder\\ExcelSheet_Practice.xlsx";
		
		InputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet_loc = book.getSheet("HTMLfull"); 
		
		String fly = ""; 
		String text = "";
		
			
		for(int i = 1; i<=6;i++) // row 
		{
			Row row = sheet_loc.getRow(i); //row - 7
			List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'customers']//tr//td["+i+"]"));
			
			for(int j = 1;j<=3;j++) // cells// Excel sheet code - j= 3
			{
				Cell cell = row.getCell(j); 		
				fly = cell.getStringCellValue();
			}
			
			for(int k = 1 ; k<18;k++) //html web elements - j = 18 
			{
				text = cells.get(k).getText(); 
				boolean result = text.equals(fly);
			
			if(result == true)
			{
				System.out.println("Test passed");
			}
			else
			{
				System.out.println("Test failed");
			}
			//System.out.println("");
			}
	}
}
}
