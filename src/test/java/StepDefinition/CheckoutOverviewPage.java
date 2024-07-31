package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static pages.CheckoutOverviewPage.*;

public class CheckoutOverviewPage {

    @Then("^User will be redirected to the Checkout Overview$")
    public void user_will_be_redirected_to_the_Checkout_Overview() {
        String actualCOOverviewHeadline = validateCOOverviewHeadline();
        assertEquals("Checkout: Overview", actualCOOverviewHeadline);
    }

    @And("^User should be able to view all of product checkouted$")
    public void user_views_products_checkouted() {
        boolean isAppeared = validateCOProductName();
        assertTrue(isAppeared);
    }

    @And("^User should be able to view Payment Information$")
    public void user_views_payment_info() {
        boolean isPaymentInfoValueAppeared = validateCOPaymentInfo();
        assertTrue(isPaymentInfoValueAppeared);
    }

    @And("^User should be able to view Shipping Information$")
    public void user_views_shipping_info() {
        boolean isShippingInfoValueAppeared = validateCOShippingInfo();
        assertTrue(isShippingInfoValueAppeared);
    }

    @And("^User should be able to view Price Total$")
    public void user_views_price_total() {
        String actualPriceTotal = validateCOPriceTotal();
        assertEquals("Total: $43.18", actualPriceTotal);
    }

    @When("^User clicks finish button$")
    public void user_clicks_finish_button() {
        clickFinishCOBtn();
    }
}
