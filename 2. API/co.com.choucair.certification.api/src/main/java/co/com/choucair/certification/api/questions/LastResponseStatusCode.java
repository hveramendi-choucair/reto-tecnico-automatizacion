package co.com.choucair.certification.api.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import net.serenitybdd.screenplay.rest.questions.TheResponse;
import net.serenitybdd.screenplay.rest.questions.TheResponseStatusCode;

public class LastResponseStatusCode implements Question<Boolean> {
    private int cod;

    public LastResponseStatusCode(int cod) {
        this.cod = cod;
    }

    public static LastResponseStatusCode is(int cod) {
        return new LastResponseStatusCode(cod);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int response = SerenityRest.lastResponse().statusCode();
        //System.out.println("CODEEE  " + response);
        return response == cod;
    }
}
