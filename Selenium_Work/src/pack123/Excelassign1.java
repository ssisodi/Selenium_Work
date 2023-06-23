package pack123;
/*Assignment
 * test1,pass1,
   test2,pass2,
   test3,pass3,
   test4,pass4,
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelassign1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*Store the value of the path in a string */
		String path = "G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\ExcelSheet_Practice.xlsx";
		
		InputStream file = new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet_loc = book.getSheet("Velocity"); 
		
		for(int j = 1; j<5;j++)
		{
			Row row = sheet_loc.getRow(j);
				for (int i = 0; i<2;i++)
					{
					System.out.print(row.getCell(i));
					System.out.print(",");						
					}
				System.out.println("");
		}
	}
}

