package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class CartPage extends BrowserDriver {

    public static String cartProductName_xpath = "//*[@id=\"item_4_title_link\"]/div";
    public static String checkoutBtn_xpath = "//*[@id=\"checkout\"]";

    public static boolean validateCartProductName() {
        String className = driver.findElement(By.xpath(cartProductName_xpath)).getAttribute("class");
        boolean isAppeared = false;
        if( className.equals("inventory_item_name")) {
            isAppeared = true;
        }
        return isAppeared;
    }

    public static void clickCheckoutBtn() {
        driver.findElement(By.xpath(checkoutBtn_xpath)).click();
    }
}
