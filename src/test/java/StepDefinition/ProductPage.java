package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static pages.ProductPage.*;

public class ProductPage {
    @Then("^User successfully enters to the product page$")
    public void show_product_page() {
        String actualProductHeader = validateProductHeader();
        assertEquals("Products", actualProductHeader);
    }

    @And("^User should be able to view all of product$")
    public void show_list_of_product() {
        String actualFirstProductName = validateFirstProductName();
        assertEquals("Sauce Labs Backpack", actualFirstProductName);
    }

    @When("^User clicks add to cart button$")
    public void user_clicks_add_to_cart_btn() {
        clickAddToCartBtn();
    }

    @Then("^the number of shopping cart increases$")
    public void shopping_cart_increases() {
        boolean isCartIncreased = validateShoppingCartIncreases();
        assertTrue(isCartIncreased);
    }

    @When("^User clicks remove button$")
    public void user_clicks_remove_btn() {
        clickRemoveCartBtn();
    }

    @Then("^the number of shopping cart decreases$")
    public void number_of_shopping_cart_decreases() {
        boolean isCartDecreased = validateShoppingCartDecreases();
        assertTrue(isCartDecreased);
    }

    @And("^Add to cart button appears$")
    public void add_cart_btn_appears() {
        boolean isAddToCartBtnAppeared = validateAddToCartBtnAppears();
        assertTrue(isAddToCartBtnAppeared);
    }

    @When("^User clicks the product Title$")
    public void user_clicks_the_product_title() {
        clickProductName();
    }

    @When("^User clicks shopping cart icon$")
    public void user_clicks_shopping_cart_icon() {
        clicksShoppingCartIcon();
    }

    @Then("^User will be redirected to the product page$")
    public void user_views_product_page(){
        String actualProductHeader = validateProductHeader();
        assertEquals("Products", actualProductHeader);
    }


}
