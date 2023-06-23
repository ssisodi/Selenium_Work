/*To find the exception by using using 'getNumericCellValue' */
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

public class Excelassign4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\ExcelSheet_Practice.xlsx";
		
		InputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet_loc = book.getSheet("Velocity"); 
		
		//getnumericcellvalue
		Row row = sheet_loc.getRow(3);
		
		Cell cell = row.getCell(1);
		
		double value = cell.getNumericCellValue(); 
		System.out.println(value);
/*ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
Exception in thread "main" java.lang.IllegalStateException: Cannot get a NUMERIC value from a STRING cell
	at org.apache.poi.xssf.usermodel.XSSFCell.typeMismatch(XSSFCell.java:987)
	at org.apache.poi.xssf.usermodel.XSSFCell.getNumericCellValue(XSSFCell.java:260)
	at pack123.Excelassign4.main(Excelassign4.java:31)

 * */
	}
}
