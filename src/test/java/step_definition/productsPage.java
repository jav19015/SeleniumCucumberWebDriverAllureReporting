package step_definition;

import io.cucumber.java.en.Then;

import static pages_objects.productsPage.*;

public class productsPage {

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page ()
    {
        FormalShoesCategory();
        SportsCategory();
        SneakersCategory();
    }
}
