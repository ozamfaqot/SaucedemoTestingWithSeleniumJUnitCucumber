package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static pages.DetailProduct.*;

public class DetailProduct {

    @Then("^User should be able to view detail product$")
    public void show_detail_product() {
        String actualProductName = validateProductName();
        assertEquals("Sauce Labs Backpack", actualProductName);
    }

    @When("^User clicks add to cart button on detail product page$")
    public void click_add_to_cart_btn_on_detail_product() {
        clickAddToCartBtn();
    }

    @Then("^the number of shopping cart increases on detail product page$")
    public void shopping_cart_increases() {
        String actualShoppingCartBadge = validateShoppingCartIncreases();
        assertEquals("shopping_cart_badge", actualShoppingCartBadge);
    }

    @When("^User clicks remove button on detail product page$")
    public void user_clicks_remove_button_on_detail_product_page() {
        clickRemoveBtn();
    }

    @Then("^Add to cart button appears on detail product page$")
    public void add_to_cart_button_appears_on_detail_product_page() {
        boolean isAppeared = addToCartBtnAppears();
        assertTrue(isAppeared);
    }
}
