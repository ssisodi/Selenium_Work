package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing3 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	
	driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	
	String title = driver.getTitle();
	System.out.println("getTitle() method will give you the website title: ");
	System.out.println(title);

	}

}
