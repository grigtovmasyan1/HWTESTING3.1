import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrive {
    public static WebDrive driver;

    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}