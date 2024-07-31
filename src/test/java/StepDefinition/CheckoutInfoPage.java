package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.CheckoutInfoPage.*;

public class CheckoutInfoPage {

    @Then("^User will be redirected to the checkout information page$")
    public void redirected_to_co_info_page() {
        String actualCOInfoHeadline = validateCOInfoHeadline();
        assertEquals("Checkout: Your Information", actualCOInfoHeadline);
    }

    @And("^User inputs valid checkout information$")
    public void user_inputs_valid_checkout_information() {
        inputFirstname();
        inputLastName();
        inputPostalCode();
    }

    @When("^User clicks continue button$")
    public void user_clicks_continue_button() {
        clickContinueCheckoutBtn();
    }
}
