package co.com.choucair.certification.api.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features = "src/test/resources/features/create.feature",
                glue = {"co.com.choucair.certification.api.stepdefinitions", "co.com.choucair.certification.api.util"},
                snippets = SnippetType.CAMELCASE
        )

public class RunnerTags {
}
