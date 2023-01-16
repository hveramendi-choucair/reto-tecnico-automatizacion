package co.com.choucair.certification.api.stepdefinitions;

import co.com.choucair.certification.api.model.ModelCreateEmployeeRest;
import co.com.choucair.certification.api.questions.LastResponseStatusCode;
import co.com.choucair.certification.api.tasks.CreateEmployeeRest;
import static co.com.choucair.certification.api.util.Constant.VALUE;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CreateStepdefs {
    @When("^you create an employee$")
    public void youCreateAnEmployee(List<ModelCreateEmployeeRest> modelCreateEmployeeRest)  {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateEmployeeRest.with(modelCreateEmployeeRest));
    }

    @Then("^I see the employee create$")
    public void iSeeTheEmployeeCreate()  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
