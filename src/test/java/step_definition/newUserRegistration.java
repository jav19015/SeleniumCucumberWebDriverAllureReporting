package step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages_objects.registrationPage.*;

public class newUserRegistration {

    @When("User clicks on new registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {

        click_on_registration_button();

    }
    @Then("User should be able to view the registration page")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        registration_form();
        successful_registration();
    }
}
