package pack123;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
public class Screenshot2 {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "G:\\My Drive\\HP Pavillion Backup\\Documents\\Notes-VCT\\chromedriver_win32_110\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(option);

        driver.get("https://www.facebook.com");

        Thread.sleep(3000);
        driver.manage().window().maximize();

        TakesScreenshot t = (TakesScreenshot) driver;
/*
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        String dateTimeString = now.format(formatter);
*/
        /*Even if you learn the syntaxes for timestamp it will be fine, as this works everytime*/
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
        Date dt = new Date();
        String timeStamp = df.format(dt);
        
        File Src = t.getScreenshotAs(OutputType.FILE);

        File Dest = new File("C:\\Users\\siddr\\OneDrive\\Pictures\\Screensc\\t" + timeStamp + ".jpeg");

        FileHandler.copy(Src, Dest);

        driver.quit();
    }
}
