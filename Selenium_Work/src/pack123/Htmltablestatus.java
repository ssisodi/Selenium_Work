package pack123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltablestatus {

	public static void main(String[] args) throws InterruptedException {
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
				System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
												
				//Browser is launched at object creation 
				WebDriver driver = new ChromeDriver(); // private // Default
								
				driver.get("https://www.w3schools.com/html/html_tables.asp");	
				
				Thread.sleep(3000);
				
				String array [] = {"Alfreds Futterkiste","Maria Anders", "Germany", "Centro comercial Moctezuma", 
						"Francisco Chang","Mexico","Ernst Handel","Roland Mendel","Austria","Island Trading",
						"Helen Bennett","UK","Laughing Bacchus Winecellars","Yoshi Tannamuri","Canada",
						"Magazzini Alimentari Riuniti", "Giovanni Rovelli","Italy"};
			
				List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'customers']//tr//td"));
				
				for (int i = 0;i<cells.size();i++)
				{
				String text = cells.get(i).getText();
				boolean result = text.equals(array[i]);
				
				if (result == true)
				{
				System.out.println("HTML passed");
				}
				else 
				{
					System.out.println("HTML failed");
				}
			}
	}

}
//String array [] = {"Alfreds Futterkiste","Maria Anders", "Germany", "Centro comercial Moctezuma", "Francisco Chang","Mexico","Ernst Handel","Roland Mendel","Austria","Island Trading","Helen Bennett","UK","Laughing Bacchus", "Winecellars","Yoshi Tannamuri,Canada","Magazzini Alimentari Riuniti", "Giovanni Rovelli","Italy"};

/*
for(int j = 2;j<rows.size();j++)
{
	List<WebElement> cells_compare = driver.findElements(By.xpath("//table[@id = 'customers']//tr//td["+j+"]"));
	for(int k = 0; k<cells_compare.size();k++)
	{
		String text_compare = cells_compare.get(k).getText();
		if (text_compare.equals(array[k]))
		{
			System.out.println("Passed");
		}
		else 
		{
			System.out.println("Failed");
		}
					
	}
}*/