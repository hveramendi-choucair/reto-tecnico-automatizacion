package co.com.choucair.certification.autom.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.concurrent.ThreadLocalRandom;

public class ProductPage extends PageObject {

    //private static  Integer numProducto = ThreadLocalRandom.current().nextInt(1, 10 + 1);;


    public static final Target BTN_COMPRA_RAPIDA = Target.the("To select quick purchase")
            .located(By.xpath("(//span[@class=\"w-100 h-100\"])[" + 1 + "]"));
    /*
     public static final Target BTN_COMPRA_RAPIDA = Target.the("To select quick purchase")
             .located(By.xpath("(//div[@class=\"exito-vtex-components-4-x-main\"])["+1+"]"));
     public static final Target BTN_COMPRA_RAPIDA2 = Target.the("To select quick purchase")
             .located(By.xpath("(//div[@class=\"exito-vtex-components-4-x-main\"])["+2+"]"));
     */
    public static final Target BTN_AGREGAR_CARRO = Target.the("To add product to the cart")
            .located(By.xpath("//div/span[contains(text(), 'Agregar')]"));
    public static final Target BTN_AGREGAR_CANTIDAD = Target.the("To change the quantity you want to buy")
            .located(By.xpath("//span[@class=\"product-details-exito-vtex-components-buy-button-manager-more\"]"));
    public static final Target BTN_CONTINUAR_COMPRA = Target.the("To continue shopping")
            .located(By.xpath("//p[contains(text(), 'Continuar comprando')]"));
}
