import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class WebDriverTesting {
    public static WebDriverTesting driver;

    @BeforeClass
    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public static void navigation(){
        driver.get("https://www.spyur.am/en/home");

        var elem1 = driver.findElement(By.name("What"));

        elem1.sendKeys("grand candy");


        var elem2 = driver.findElement(By.name("Where"));
        elem2.sendKeys("yerevan");
        elem2.click();

    }
}