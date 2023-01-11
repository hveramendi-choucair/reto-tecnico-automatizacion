package co.com.choucair.certification.autom.stepdefinitions;

import co.com.choucair.certification.autom.tasks.AbrirPagina;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class MyStepdefs {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a customer is on the online store$")
    public void aCustomerIsOnTheOnlineStore() {
        OnStage.theActorCalled("Customer").wasAbleTo(AbrirPagina.urlWeb());
    }

    @When("^he selects one category page$")
    public void heSelectsOneCategoryPage() {
    }

    @And("^he adds the products to the cart$")
    public void heAddsTheProductsToTheCart() {
    }

    @And("^he goes to view his cart$")
    public void heGoesToViewHisCart() {
    }

    @Then("^he should see the added products in the shopping car$")
    public void heShouldSeeTheAddedProductsInTheShoppingCar() {
    }

    @And("^the total price should be correct$")
    public void theTotalPriceShouldBeCorrect() {
    }

    @And("^the products added should be correct$")
    public void theProductsAddedShouldBeCorrect() {
    }
}
