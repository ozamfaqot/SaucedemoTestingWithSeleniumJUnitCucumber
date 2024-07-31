package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class CheckoutCompletePage extends BrowserDriver {

    public static String coCompleteHeadline_xpath = "//*[@id=\"header_container\"]/div[2]/span";
    public static String coCompleteMsg_xpath = "//*[@id=\"checkout_complete_container\"]/h2";
    public static String backHomeBtn_xpath = "//*[@id=\"back-to-products\"]";

    public static String validateCOCompleteHeadline() {
        return driver.findElement(By.xpath(coCompleteHeadline_xpath)).getText();
    }

    public static boolean validateCOCompleteMsgAppears() {
        String coCompleteMsg = driver.findElement(By.xpath(coCompleteMsg_xpath)).getText();
        boolean isAppeared = false;
        if(coCompleteMsg.equals("Thank you for your order!")) {
            isAppeared = true;
        }
        return isAppeared;
    }

    public static void clickBackHomeBtn() {
        driver.findElement(By.xpath(backHomeBtn_xpath)).click();
    }
}
