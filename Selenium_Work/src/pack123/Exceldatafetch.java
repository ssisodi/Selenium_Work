package pack123;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*How to fetch data from Excel sheet*/
public class Exceldatafetch {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		/*Store the value of the path in a string */
		String path = "C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\Selenium_Practice folder\\ExcelSheet_Practice.xlsx";
		
		InputStream file = new FileInputStream(path);
/*After storing the path in String, on this step we have to show it to the JVM*/				
// Where 'file' is the object reference. And String 'path' is passed as parameter to the FileInputStream
// FileInputStream is an concrete class of the InputStream which is a abstract class. 
// We can also write line 22 as --- InputStream file = new FileInputStream(path);				
	
				
		// This method is used to open the file which has saved the path of the XLSX file  		
		Workbook book = WorkbookFactory.create(file);
		
				
		/*After the file is open, the sheet is to be selected. */	
		Sheet sheet_loc = book.getSheet("Velocity"); 

		int lastrow = sheet_loc.getLastRowNum(); // This will give us the last row number of the excel sheet starting from index 0 and not 1. 
		System.out.println("Last row is: "+ lastrow); // 12

		// select row 	
		Row row = sheet_loc.getRow(1);
//		Row row = sheet_loc.getRow(1); // This will select the row to be worked from the sheet.		
		
		int last_cell = row.getLastCellNum(); // Getting the last cell number from the row number 3 
		System.out.println("The lastcell number is: "+last_cell); // 2
		
		int first_cell = row.getFirstCellNum();// Getting the first cell number from the row number 3 
		System.out.println("The firstcell number is: "+first_cell); //0

		// select cell
		Cell cell = row.getCell(0);
		
		//Below three lines are copying the data. 	
		String text = cell.getStringCellValue();
		System.out.println("Get the cell value using string type" + text);

		double value = cell.getNumericCellValue();
		System.out.println("Numeric cell value"+ value);

		Date date = cell.getDateCellValue();
		System.out.println(date);
	}
}









/*String result = WorkbookFactory.create(file).getSheet("Velocity").getRow(4).getCell(1).getStringCellValue();
System.out.println(result);*/
