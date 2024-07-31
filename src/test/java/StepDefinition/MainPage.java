package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.HomePage.*;

public class MainPage {

    @Given("^User is on the login page$")
    public void user_is_on_the_login_page() {
        String actualHeader = validateHomePage();
        assertEquals("Swag Labs", actualHeader);
    }

    @When("^User inputs valid credentials$")
    public void user_inputs_valid_credentials() {
        inputValidUsernameKey();
        inputValidPasswordKey();
        clickLoginBtn();
    }

    @When("^User inputs invalid credentials$")
    public void user_inputs_invalid_credentials() {
        inputInvalidUsernameKey();
        inputInvalidPasswordKey();
        clickLoginBtn();
    }

    @Then("^Error message appears$")
    public void error_message_appears() {
        String actualErrorMessage = validateErrorMessageAppears();
        assertEquals("Epic sadface: Username and password do not match any user in this service", actualErrorMessage);
    }
}
