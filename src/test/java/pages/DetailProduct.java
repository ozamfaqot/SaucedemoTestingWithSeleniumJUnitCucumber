package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import java.sql.SQLOutput;

public class DetailProduct extends BrowserDriver {

    public static String titleProduct_xpath = "//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]";
    public static String addToCartBtn_xpath = "//*[@id=\"add-to-cart\"]";
    public static String shoppingCartBadge_xpath = "//*[@id=\"shopping_cart_container\"]/a/span";
    public static String removeBtn_xpath = "//*[@id=\"remove\"]";

    public static String validateProductName() {
        return driver.findElement(By.xpath(titleProduct_xpath)).getText();
    }

    public static void clickAddToCartBtn() {
        driver.findElement(By.xpath(addToCartBtn_xpath)).click();
    }

    public static String validateShoppingCartIncreases() {
        return driver.findElement(By.xpath(shoppingCartBadge_xpath)).getAttribute("class");
    }

    public static void clickRemoveBtn() {
        driver.findElement(By.xpath(removeBtn_xpath)).click();
    }

    public static boolean addToCartBtnAppears() {
        String addToCartBtnText = driver.findElement(By.xpath(addToCartBtn_xpath)).getText();
        boolean isAppeared = false;
        if (addToCartBtnText.equals("Add to cart")) {
            isAppeared = true;
        }
        return isAppeared;
    }
}
