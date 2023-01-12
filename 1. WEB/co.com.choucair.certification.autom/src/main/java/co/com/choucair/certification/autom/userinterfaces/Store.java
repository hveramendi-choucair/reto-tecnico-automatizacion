package co.com.choucair.certification.autom.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import java.util.concurrent.ThreadLocalRandom;

@DefaultUrl("https://www.exito.com/")
public class Store extends PageObject {
    public static final Target MENU_CATEGORY = Target.the("To select the menu category on store")
            .located(By.id("category-menu"));
    public static final Target TOP_CATEGORY = Target.the("To select an top category on store")
            .located(By.id("undefined-nivel2-Dormitorio"));
    public static final Target SUB_CATEGORY = Target.the("To select an sub-category on store")
            .located(By.xpath("//a/p[@id=\"Categorías-nivel3-Cabeceros\"]"));
}