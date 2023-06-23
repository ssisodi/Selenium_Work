/*To find the exception by using using 'getStringCellValue' */
package pack123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelassign5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\Selenium_Practice folder\\ExcelSheet_Practice.xlsx";
		
		InputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet_loc = book.getSheet("Velocity"); 
		
		//getstringcellvalue
				Row row = sheet_loc.getRow(9);
				
				Cell cell = row.getCell(1);
				
				String value = cell.getStringCellValue();
				System.out.println(value);
/*ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
Exception in thread "main" java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell
	at org.apache.poi.xssf.usermodel.XSSFCell.typeMismatch(XSSFCell.java:987)
	at org.apache.poi.xssf.usermodel.XSSFCell.getRichStringCellValue(XSSFCell.java:336)
	at org.apache.poi.xssf.usermodel.XSSFCell.getStringCellValue(XSSFCell.java:280)
	at pack123.Excelassign5.main(Excelassign5.java:31)*/				
	}
}
