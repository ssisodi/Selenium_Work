package pack123;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {

	public static void main(String[] args) throws InterruptedException
	{		
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
						
		//browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default
			
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(5000);
		
	    WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));

        Thread.sleep(5000);

        alertbox.click();
        
        Thread.sleep(2000); 
        
        Set<String> a=driver.getWindowHandles();

        ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
        String a1=addr.get(1);
        
        driver.switchTo().window(a1);

        Thread.sleep(5000);
        
        WebElement getyour=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));

        getyour.click();

        ArrayList<String> addr1 = new ArrayList<String>(driver.getWindowHandles());
        String a2 = addr1.get(2);
        System.out.println(a2);
        
   	}
}

/* Iframe Assignment 
 * Step 1 :- Click on 'Try it Yourself' of Alert Box of https://www.w3schools.com/js/js_popup.asp
 * Step 2 :- Click on 'Try it' of Javascript alert box and click on Ok box
 * Step 3 :-  Click on 'Get your own website' green tab. 
 * */

//String mainpage = driver.getWindowHandle();
//System.out.println(mainpage);


//addr=new ArrayList<String>(driver.getWindowHandles());

//System.out.println(a1);



//WebElement confirmbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));

//WebElement promptbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));

//WebElement linkbreak=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));

