package co.com.choucair.certification.autom.tasks;

import co.com.choucair.certification.autom.userinterfaces.Store;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Categoria implements Task {
    public static Categoria seleccionarCategoria() {
        return Tasks.instrumented(Categoria.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Store.MENU_CATEGORY),
                         Click.on(Store.TOP_CATEGORY),
                         Click.on(Store.SUB_CATEGORY) );
    }
}
