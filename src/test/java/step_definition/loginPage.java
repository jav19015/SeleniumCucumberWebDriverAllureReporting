package step_definition;

import io.cucumber.java.en.When;

import static pages_objects.loginPage.*;

public class loginPage {


    @When("User successfully enters the log in details")
    public void userSuccessfullyEntersTheLogInDetailsAnd() throws InterruptedException
    {
        types_username();
        types_password();
        click_on_login_button();
    }
}
