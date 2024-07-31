package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class CheckoutInfoPage extends BrowserDriver {

    public static String coInfoHeadline_xpath = "//*[@id=\"header_container\"]/div[2]/span";
    public static String firstname_xpath = "//*[@id=\"first-name\"]";
    public static String lastname_xpath = "//*[@id=\"last-name\"]";
    public static String postalcode_xpath = "//*[@id=\"postal-code\"]";
    public static String continueCheckoutBtn = "//*[@id=\"continue\"]";

    public static String validateCOInfoHeadline() {
        return driver.findElement(By.xpath(coInfoHeadline_xpath)).getText();
    }

    public static void inputFirstname() {
        driver.findElement(By.xpath(firstname_xpath)).sendKeys("Abdur");
    }

    public static void inputLastName() {
        driver.findElement(By.xpath(lastname_xpath)).sendKeys("Rohman");
    }

    public static void inputPostalCode() {
        driver.findElement(By.xpath(postalcode_xpath)).sendKeys("126659");
    }

    public static void clickContinueCheckoutBtn() {
        driver.findElement(By.xpath(continueCheckoutBtn)).click();
    }
}
