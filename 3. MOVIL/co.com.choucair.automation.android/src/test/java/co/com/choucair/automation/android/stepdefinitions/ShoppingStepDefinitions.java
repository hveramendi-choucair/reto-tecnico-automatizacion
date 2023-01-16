package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ShoppingStepDefinitions {

    @Given("^that (.*) is on the app store$")
    public void thatJuanIsOnTheAppStore(String brandon) {
        OnStage.theActorCalled(brandon).wasAbleTo(OpenThe.exitoApp());
    }

    @When("^he login with username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void heLoginWithUsernameAndThePassword(String arg1, String arg2) {
    }

    @When("^he selects one category page$")
    public void heSelectsOneCategoryPage() {
    }

    @When("^he adds one products to the cart$")
    public void heAddsOneProductsToTheCart() {
    }

    @When("^he goes to view his shopping cart$")
    public void heGoesToViewHisShoppingCart() {
    }

    @Then("^he should see the added products in the shopping cart$")
    public void heShouldSeeTheAddedProductsInTheShoppingCart() {
    }
}
