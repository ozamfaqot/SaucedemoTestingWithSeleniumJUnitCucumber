package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static pages.CheckoutCompletePage.*;

public class CheckoutCompletePage {
    @Then("^User will be redirected to the checkout complete page$")
    public void user_will_be_redirected_to_co_complete_page() {
        String actualCoCompleteHeadline = validateCOCompleteHeadline();
        assertEquals("Checkout: Complete!", actualCoCompleteHeadline);
    }

    @And("^User can view checkout complete successfully message$")
    public void show_checkout_complete_successfully_msg() {
        boolean isCoCompleteMsgAppeared = validateCOCompleteMsgAppears();
        assertTrue(isCoCompleteMsgAppeared);
    }

    @When("^User clicks back home button$")
    public void user_clicks_back_home_btn() {
        clickBackHomeBtn();
    }
}
