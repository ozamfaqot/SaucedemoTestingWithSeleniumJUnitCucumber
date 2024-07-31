package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String headerHomePage_xpath = "//*[@id=\"root\"]/div/div[1]";
    public static String usernameText_xpath = "//*[@id=\"user-name\"]";
    public static String passwordText_xpath = "//*[@id=\"password\"]";
    public static String loginBtn_xpath = "//*[@id=\"login-button\"]";
    public static String errorMessage_xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]";

    public static String validateHomePage() {
        return driver.findElement(By.xpath(headerHomePage_xpath)).getText();
    }

    public static void inputValidUsernameKey() {
        driver.findElement(By.xpath(usernameText_xpath)).sendKeys("standard_user");
    }
    public static void inputInvalidUsernameKey() {
        driver.findElement(By.xpath(usernameText_xpath)).sendKeys("standard_user_invalid");
    }
    public static void inputValidPasswordKey() {
        driver.findElement(By.xpath(passwordText_xpath)).sendKeys("secret_sauce");
    }
    public static void inputInvalidPasswordKey() {
        driver.findElement(By.xpath(passwordText_xpath)).sendKeys("secret_sauce_invalid");
    }
    public static void clickLoginBtn() {
        driver.findElement(By.xpath(loginBtn_xpath)).click();
    }

    public static String validateErrorMessageAppears() {
        return driver.findElement(By.xpath(errorMessage_xpath)).getText();
    }
}
