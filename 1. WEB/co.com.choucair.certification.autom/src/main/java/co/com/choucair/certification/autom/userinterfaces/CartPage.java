package co.com.choucair.certification.autom.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public static final Target BTN_GOTO_CART = Target.the("To go to cart page")
            .located(By.xpath("//div[@class=\"exito-header-3-x-minicartQuantity\"]"));
}
