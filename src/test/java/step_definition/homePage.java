package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages_objects.homePage.*;

public class homePage {

    @Given("User navigates to the login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signInPortal_link();


    }


}
