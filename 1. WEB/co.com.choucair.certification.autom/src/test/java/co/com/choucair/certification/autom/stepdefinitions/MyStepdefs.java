package co.com.choucair.certification.autom.stepdefinitions;

import co.com.choucair.certification.autom.questions.ShoppingCartAnswer;
import co.com.choucair.certification.autom.tasks.AbrirPagina;
import co.com.choucair.certification.autom.tasks.Carro;
import co.com.choucair.certification.autom.tasks.Categoria;
import co.com.choucair.certification.autom.tasks.Productos;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

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
        OnStage.theActorInTheSpotlight().attemptsTo(Categoria.seleccionarCategoria());
    }

    @And("^he adds the products to the cart$")
    public void heAddsTheProductsToTheCart() {
        //for(int i = 0; i < 5; i ++) {
            OnStage.theActorInTheSpotlight().attemptsTo(Productos.agregar());
        //}
    }

    @And("^he goes to view his cart$")
    public void heGoesToViewHisCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(Carro.gotoCart());
    }

    @Then("^he should see the added products in the shopping car$")
    public void heShouldSeeTheAddedProductsInTheShoppingCar() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ShoppingCartAnswer.addedResult(), Matchers.equalTo("Tu compra es 100% segura")));
    }

    @And("^the total price should be correct$")
    public void theTotalPriceShouldBeCorrect() {
    }

    @And("^the products added should be correct$")
    public void theProductsAddedShouldBeCorrect() {
    }
}
