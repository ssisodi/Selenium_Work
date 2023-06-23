package pack123;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com");
		
		// How to test the size of the browser. 
		 
		Dimension d = new Dimension(300,300); 
		driver.manage().window().setSize(d);
		
		// How to change the position of the browser
		
		Point p = new Point(200,200); // (X,Y) -- First quadrant
		driver.manage().window().setPosition(p);
		
		Thread.sleep(3000);
		
		Point q = new Point(-200,200);// (-X,Y) -- Second quadrant
		driver.manage().window().setPosition(q);
		
		Thread.sleep(3000);
		
		Point r = new Point(-200,-200);// (-X,-Y) -- Third quadrant
		driver.manage().window().setPosition(r);
		
		Thread.sleep(3000);
		
		Point s = new Point(200,-200);// (X,-Y) -- Fourth quadrant
		driver.manage().window().setPosition(s);
	}
}
