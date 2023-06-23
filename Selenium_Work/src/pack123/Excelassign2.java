/*Comparing HTML webelements with Excel sheet*/

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

public class Excelassign2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//Browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default
						
		driver.get("https://www.w3schools.com/html/html_tables.asp");	
		
		Thread.sleep(3000);
		
		List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'customers']//tr//td"));
		
		/*Store the value of the path in a string */
		String path = "C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\Selenium_Practice folder\\ExcelSheet_Practice.xlsx";
		
		InputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet_loc = book.getSheet("HTMLtable"); 
		
		for(int i = 0; i<cells.size();i++)
		{
			String text = cells.get(i).getText();
						
			Row row = sheet_loc.getRow(i);
			Cell cell = row.getCell(0);
			String fly = cell.getStringCellValue(); // Most important step
					
			if(fly.equals(text))
			{
				System.out.println("Test passed");
			}
			else 
			{
				System.out.println("Test failed");
			}
			
		}
	}
}
