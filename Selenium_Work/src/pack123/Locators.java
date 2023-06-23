package pack123;
/*How to get multiple web elements using Class name and Tagname Locators*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		//Configuring the system properties of Chrome driver BUT browser is not launched at this step
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SID9T\\OneDrive\\Documents\\Notes-VCT\\chromedriver_win32\\chromedriver.exe");
		
		//browser is launched at object creation 
		WebDriver driver = new ChromeDriver(); // private // Default 
		
		driver.get("https://www.flipkart.com/veirdo-printed-men-round-neck-multicolor-t-shirt/p/itmeeb81547bcb90?pid=TSHGFWBGFPJFDVZH&lid=LSTTSHGFWBGFPJFDVZHMKQKIU&marketplace=FLIPKART&store=clo%2Fash%2Fank%2Fedy&srno=b_1_2&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&fm=organic&iid=en_b0kcELf4ae9u0rUlbwKJaOPIZPuds79vCiYr03QnprGmq0azVf7IRVQxI02lWk%2BXyJSsT216LnnVvnAy4YlKqg%3D%3D&ppt=browse&ppn=browse");
		
		
		// ***********Finding multiple web elements using Class name****************** 
		//Step 1:- Identifying the class attribute with common attribute value for multiple slider elements. 
		List<WebElement> Verido	= driver.findElements(By.className("q6DClP"));
		/*Here we are observing how to capture multiple web elements using 'findElements()', 
		 *which returns all the web elements with the same class name() as passed in the argument.
		 * in a variable 'Verido' such that the variable has a return type as List<WebElement>
		 * signifying that its saving the list of web elements in it. */
		System.out.println("The size of the web elements with class name is: " +Verido.size());
		/*If you want to find total number of web elements in the list? What method do we use ?
		length --- a.length is used for checking length of array
		length() -- This is used for checking the length of string length()
		Size() -- This is used for checking the length of List, Set, Hashmap collection.*/
//---------------------------------------------------------------------------------------------------------------------------------		
		/*NOTE: About finding multiple webelement using class name
		 * Some images may not have the same class name or in some case won't even have a class names. 
		 * So, to find multiple image type web elements we can't reply on Class as an attribute. 
		 * But, every image as web element is having 'img' as a tagname.
		 * This is where we use 'img' as tag name to find multiple images as web elements*/
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("The size of web elements with tagname 'img' is: " + images.size());
//----------------------------------------------------------------------------------------------------------------------------------
		// How to capture total number of links? 
		
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links on this webpage is: " + Link.size());
		/*The total number of links have one thing in common in all, that is the Anchor tag '<a href>'
		 * that's why 'a' is taken in findelements. */
	}
}
