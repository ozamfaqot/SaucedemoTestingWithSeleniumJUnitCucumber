package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class CheckoutOverviewPage extends BrowserDriver {
    public static String coOverviewHeadline = "//*[@id=\"header_container\"]/div[2]/span";
    public static String coProductName = "//*[@id=\"item_4_title_link\"]/div";
    public static String paymentInfoValue_xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]";
    public static String shippingInfoValue_xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]";
    public static String priceTotal_xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]";
    public static String finishCOBtn_xpath = "//*[@id=\"finish\"]";

    public static String validateCOOverviewHeadline() {
        return driver.findElement(By.xpath(coOverviewHeadline)).getText();
    }

    public static boolean validateCOProductName() {
        String productName = driver.findElement(By.xpath(coProductName)).getAttribute("class");
        boolean isAppeared = false;
        if(productName.equals("inventory_item_name")) {
            isAppeared = true;
        }
        return isAppeared;
    }

    public static boolean validateCOPaymentInfo() {
        String paymentInfoValue = driver.findElement(By.xpath(paymentInfoValue_xpath)).getText();
        boolean isAppeared = false;
        if(paymentInfoValue.equals("SauceCard #31337")) {
            isAppeared = true;
        }
        return isAppeared;
    }

    public static boolean validateCOShippingInfo() {
        String shippingInfoValue = driver.findElement(By.xpath(shippingInfoValue_xpath)).getText();
        boolean isAppeared = false;
        if(shippingInfoValue.equals("Free Pony Express Delivery!")) {
            isAppeared = true;
        }
        return isAppeared;
    }

    public static String validateCOPriceTotal() {
        return driver.findElement(By.xpath(priceTotal_xpath)).getText();
    }

    public static void clickFinishCOBtn() {
        driver.findElement(By.xpath(finishCOBtn_xpath)).click();
    }
}
