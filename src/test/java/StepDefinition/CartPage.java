package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;
import static pages.CartPage.*;

public class CartPage {
    @Then("^User should be able to view List products on the cart page$")
    public void view_list_products_on_the_cart_page() {
        boolean actualClassName = validateCartProductName();
        assertTrue(actualClassName);
    }

    @When("^User clicks checkout button$")
    public void user_clicks_checkout_button() {
        clickCheckoutBtn();
    }
}
