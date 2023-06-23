package pack123;
import java.util.List;

import org.openqa.selenium.By;
/*How to handle HTML table*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Assignment 1: Comma seperated HTML table values to be printed from each row.*/
public class Htmltable {
	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
										
		//Browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default
						
		driver.get("https://www.w3schools.com/html/html_tables.asp");	
		
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'customers']//tr"));
		/*Getting the Xpath reference 'rows' to get us the reference of list of row in the table that ranging from index value 1 to 7 */
		
		for(int i = 1;i<rows.size();i++ )// Here, the for loop is setting the range of number of rows we need to check.  
		{
			List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'customers']//tr["+i+"]//td")); 
			// Here, for loop is to reference only specific index value of the row's customized Xpath
			
			for(int j = 0;j<cells.size();j++) 
			// For loop for counting all the 18 elements in the table
				
			{
				String text = cells.get(j).getText(); //We are getting the table data present at each index values from 1 to 18 
				System.out.print(text);// Here, we're printing all the values of text data that come under only line 26 Xpath reference - cells. 
				System.out.print(","); // Here, wer're using 'print' instead of 'println' to make the printed elements look comma separated. 
			}
			System.out.println("");

		}
	}
}

