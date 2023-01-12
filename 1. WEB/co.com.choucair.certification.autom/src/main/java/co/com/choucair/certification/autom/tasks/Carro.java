package co.com.choucair.certification.autom.tasks;

import co.com.choucair.certification.autom.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Carro implements Task {
    public static Carro gotoCart() {
        return Tasks.instrumented(Carro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CartPage.BTN_GOTO_CART));
    }
}
