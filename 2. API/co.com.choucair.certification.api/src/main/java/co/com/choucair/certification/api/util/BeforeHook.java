package co.com.choucair.certification.api.util;

import static co.com.choucair.certification.api.util.enums.RestService.BASE_URL;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

import org.junit.Before;

public class BeforeHook {
@Before
public void prepareStage() {
    OnStage.setTheStage(new OnlineCast());
    OnStage.theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
}

}
