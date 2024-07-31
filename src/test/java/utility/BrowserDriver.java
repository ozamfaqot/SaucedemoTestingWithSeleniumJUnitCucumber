package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {

    public static WebDriver driver;

    public BrowserDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    public void close() {
        this.driver.close();
    }
}
