package pack123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//Browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default
						
		driver.get("https://www.w3schools.com/html/html_tables.asp");	
		
		String array[] = {}; 
		List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'customers']//tr//td"));
		
		for (int i = 0;i<cells.size();i++)
		{
		String text = cells.get(i).getText();
		boolean result = text.equals(array[i]);
		System.out.println(result);
		}
	}
}
