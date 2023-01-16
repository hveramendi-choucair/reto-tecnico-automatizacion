package co.com.choucair.certification.autom.tasks;

import co.com.choucair.certification.autom.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.concurrent.ThreadLocalRandom;


public class Productos implements Task {
    public static Productos agregar() {
        return Tasks.instrumented(Productos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(ProductPage.BTN_COMPRA_RAPIDA),
                    Click.on(ProductPage.BTN_AGREGAR_CARRO));
            for (int i = 0; i < 3; i++) {
                actor.attemptsTo(
                        Click.on(ProductPage.BTN_AGREGAR_CANTIDAD));
            }
        actor.attemptsTo(Click.on(ProductPage.BTN_CONTINUAR_COMPRA));
    }
}
