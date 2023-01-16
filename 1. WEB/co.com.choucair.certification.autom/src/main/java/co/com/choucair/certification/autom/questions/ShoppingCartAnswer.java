package co.com.choucair.certification.autom.questions;

import co.com.choucair.certification.autom.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ShoppingCartAnswer implements Question {

    public static ShoppingCartAnswer addedResult() {
        return new ShoppingCartAnswer();
    }
    @Override

    public Object answeredBy(Actor actor) {
        return Text.of(CartPage.RESULT_CART).viewedBy(actor).asString();
    }
}


