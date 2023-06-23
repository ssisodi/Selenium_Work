package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Omnify {

	public static void main(String[] args) 
	{
		// Chrome Driver path 
		System.setProperty("webdriver.chrome.driver","G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32_110\\chromedriver.exe");
		// Chrome Options for sessionnotfound exception 		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//Object for chrome driver is created with 'options' object reference passed as parameter. 
		WebDriver driver = new ChromeDriver(options);
		//Actions class declared here to globally access mouse actions. 
		Actions act = new Actions(driver);
		//URL from my account access: ritathakare20@gmail.com"
		driver.get("https://app.getomnify.com/web/login/verify/7lhEOe0M2T9gwcZci3cdMLRNwf7xq2EW?expires=1680166852&signature=3d39f5042749c9d58d2df1f9b21aff3bc92db21457d83cc89d67a7cd8065cd7b");
		// Window maximized after URL is hit.
		driver.manage().window().maximize();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// HomePage of Omnify
		
		// WebElement of Service tab is found and clicked.  
		WebElement services = driver.findElement(By.xpath("(//a[@class = 'main-navigation-link w-inline-block '])[4]"));
		services.click();
		
		// Page refreshes for Service tab and allows us to select 'Classes' and with the help of mouse action we move to it and click it. 
		WebElement classes = driver.findElement(By.xpath("//div[text() = 'Classes']"));
		act.moveToElement(classes).click().build().perform();
		
		//WeElement for createService button to click on it
		WebElement createService = driver.findElement(By.xpath("//p[text() = 'Create a Service']"));
		createService.click();

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// webElement to create new 'Class'
		WebElement createClass = driver.findElement(By.xpath("(//div[@id = 'w-node-_495ca9f4-1ca3-0e11-655b-6680e5e680e0-84f26036']//div)[3]"));
		createClass.click();
		
		//Verify class 'Title'
		Boolean classtitle = driver.findElement(By.xpath("//input[@id = 'title']")).isEnabled();
		
		if(classtitle == true)
		{
			System.out.println("Class title is enabled");
		}
		else {
			System.out.println("Class title is disabled");
		}
		
		//WebElement to send appropriate class name using sendKeys
		WebElement classtitlename = driver.findElement(By.xpath("//input[@id = 'title']")); 
		classtitlename.sendKeys("Yoga class with Omnify");
		
      //webElement to validate class description
		WebElement descriptionbox =driver.findElement(By.xpath("//div[@class='ql-editor qlblank']"));
		
		//Verify Description_box is displayed or not 
		boolean d = descriptionbox.isDisplayed();
		if(d == true) // Description box condition
		{
		System.out.println("descriptionbox is displayed");
		}
		else
		{
		System.out.println("descriptionbox is not displayed");
		}

	   //WebElement to select the 'Class_Color' and verify the selected color
		WebElement class_color = driver.findElement(By.xpath("(//div[@id='color']//div)[3]"));
		boolean color = class_color.isSelected();
		if(color == true) // Class color condition
		{
		System.out.println("class_color is selected");

		}
		else
		{
		System.out.println("class_color is not selected");
		}
		
	   //WebElement to select default color from a list of colors. 
		WebElement selectcolor_blue = driver.findElement(By.xpath("(//div[@id='color']//div[21]"));
		selectcolor_blue.click();

		//WebElement to allow the admin to add the upload any class advertisement image.
		WebElement upload_image = driver.findElement(By.xpath("//div[@id='img-upload']"));
		upload_image.click();

		//WebElement to allow the admin to choose the file which works as advertisement.
		WebElement  Choose_File =driver.findElement(By.xpath("//div[@class='modalwrapper']//input"));
		Choose_File.click();

		//WebElement for upload button to upload the file which works as advertisement.
		WebElement upload_button = driver.findElement(By.xpath("//button[text()='Upload']"));
		boolean result = upload_button.isEnabled(); // upload button is enabled or not.
		if(result == true) // Condition for upload button
		{
		 System.out.println("Button is enabled");
		  upload_button.click();
		}
		else
		{
		System.out.println("Button is disabled");
		}
		
		// WebElement of location tab to be able to select the location of the class to happen.
		WebElement location = driver.findElement(By.xpath("(//div[text()='In-person'])[2]"));
		location.click();

		//WebElement of address tab to be able to select the address of the class to happen. 
		WebElement address = driver.findElement(By.xpath("//input[@placeholder='Add Address']"));
		address.sendKeys("123 Main Street, hinjewadi, Pune");

		//WebElement of trainer tab to be able to select the trainer allocated to this class.
		WebElement Trainer = driver.findElement(By.xpath("(//mat-icon[@aria-hidden='true'])[2]"));
		Trainer.click();

		//WebElement of AddTrainer tab to be able to select the add trainer allocated to this class. 
		WebElement AddTrainer = driver.findElement(By.xpath("(//div[@class='location-item-wrapper in-list'])[1]"));
		AddTrainer.sendKeys("lisa");

		// WebElement of service type arrow tab
		WebElement serviceType = driver.findElement(By.xpath("//mat-label[text()='Service type']"));
		serviceType.click();
		// WebElement of choose 'paid' or 'free' service from the service type tab
		WebElement paid = driver.findElement(By.xpath("//div[text()='Paid']"));
		WebElement free = driver.findElement(By.xpath("//div[text()='free']"));
		//WebElement of US Dollar tab that activates only when 'paid' tab is selected.
		WebElement usadollar = driver.findElement(By.xpath("//input[@id = 'mat-input-1']"));
		// Condition for choice of option selected in service type tab. 
		if (free.getText().equals("Free"))
		{
			free.click(); 
			usadollar.isSelected();
		}
		else
        {
		  paid.click();
          boolean price = usadollar.isEnabled();
          usadollar.sendKeys("1000");
        }

		//xpath for class limit
		WebElement Attendee_limit = driver.findElement(By.xpath("//input[@placeholder='Attendee Limit']"));
		Attendee_limit .sendKeys("20");

		//xpath to choose the duration of class
		WebElement Day_of_Week = driver.findElement(By.xpath("(//mat-icon[@aria-hidden='true'])[1]"));
		Day_of_Week.click();

		//xpath for day_of _class
		WebElement weekend = driver.findElement(By.xpath("//div[text()='Weekends']"));
		weekend.click();

		//	xpath to set startdate of the class
		WebElement StartDate = driver.findElement(By.xpath("(//mat-icon[@aria-hidden='true'])[5]"));
		StartDate.click();

		//	xpath to select the date
		WebElement SelectDate = driver.findElement(By.xpath("//div[text()='Select Date']"));
		SelectDate.click();

		WebElement calendar = driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']"));
		calendar.sendKeys("02/03/2023");

		//xpath to select the time of class
		WebElement StartTime = driver.findElement(By.xpath("//input[@placeholder='Start Time']"));
		StartTime.sendKeys("9:00 AM");

		//xpath to select the end date of the class
		WebElement endDate = driver.findElement(By.xpath("//mat-select[@id='mat-select-5']"));
		endDate.click();

		WebElement calendar1 = driver.findElement(By.xpath("//mat-calendar[@id='mat-datepicker-0']"));
		calendar1.sendKeys("02/04/2023");

		//xpath to select the End time of class
		WebElement EndTime = driver.findElement(By.xpath("//input[@placeholder='Start Time']"));
		EndTime.sendKeys("11:00 AM");

		//xpath for classBookingWindow
		WebElement BookingWindow = driver.findElement(By.xpath("(//mat-icon[@aria-hidden='true'])[7]"));
		BookingWindow .click();
		
		//Xpath for selecting the duration of 1 month 
		WebElement SelectDuration = driver.findElement(By.xpath("//div[text()='1 Month']"));
		act.moveToElement(SelectDuration);
		act.click().perform();
		

		//xpath for close Booking Window
		WebElement closeWindow = driver.findElement(By.xpath("//mat-select[@formcontrolname='bookingCloses']"));
		closeWindow.click();

		//xpath for close window time 
		WebElement closeWindowTime = driver.findElement(By.xpath("/div[text()='End of schedule']"));
		act.moveToElement(closeWindowTime);
		act.click().perform();

		driver.quit();
	}
}
