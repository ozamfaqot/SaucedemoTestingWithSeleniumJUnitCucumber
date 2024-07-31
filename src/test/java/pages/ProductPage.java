package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductPage extends BrowserDriver {
    public static String productHeadline_xpath = "//*[@id=\"header_container\"]/div[2]/span";
    public static String firstProductName_xpath = "//*[@id=\"item_4_title_link\"]/div";
    public static String shoppingCartIcon_xpath = "//*[@id=\"shopping_cart_container\"]/a";
    public static String shoppingCartBadge_xpath = "//*[@id=\"shopping_cart_container\"]/a/span";
    public static String addToCartBtn_xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
    public static String addToCartBtn2_xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]";

    public static String removeCartBtn_xpath = "//*[@id=\"remove-sauce-labs-backpack\"]";
    public static String totalNumberOfCart = "";

    public static String validateProductHeader() {
        return driver.findElement(By.xpath(productHeadline_xpath)).getText();
    }

    public static String validateFirstProductName() {
        return driver.findElement(By.xpath(firstProductName_xpath)).getText();
    }

    public static void clickProductName() {
        driver.findElement(By.xpath(firstProductName_xpath)).click();
    }

    public static void clickAddToCartBtn() {
        driver.findElement(By.xpath(addToCartBtn_xpath)).click();
        driver.findElement(By.xpath(addToCartBtn2_xpath)).click();
    }

    public static void clickRemoveCartBtn() {
        totalNumberOfCart = driver.findElement(By.xpath(shoppingCartBadge_xpath)).getText();
        driver.findElement(By.xpath(removeCartBtn_xpath)).click();
    }

    public static boolean validateAddToCartBtnAppears() {
        String addToCartBtnText = driver.findElement(By.xpath(addToCartBtn_xpath)).getText();
        boolean isAppeared = false;
        if (addToCartBtnText.equals("Add to cart")) {
            isAppeared = true;
        }
        return isAppeared;
    }

    public static boolean validateShoppingCartIncreases() {
        int actualNumber = Integer.parseInt(driver.findElement(By.xpath(shoppingCartBadge_xpath)).getText());
        boolean isCartIncreased = false;
        if (actualNumber > 0) {
            isCartIncreased = true;
        }
        return isCartIncreased;
    }

    public static boolean validateShoppingCartDecreases() {
        int totalCart = Integer.parseInt(totalNumberOfCart);
        int currentCart = Integer.parseInt(driver.findElement(By.xpath(shoppingCartBadge_xpath)).getText());
//        System.out.println(currentCart);
        boolean isCartDecreased = false;
        if (currentCart < totalCart) {
            isCartDecreased = true;
        }

        return isCartDecreased;
//        return currentCart;
    }

    public static void clicksShoppingCartIcon() {
        driver.findElement(By.xpath(shoppingCartIcon_xpath)).click();
    }
}
