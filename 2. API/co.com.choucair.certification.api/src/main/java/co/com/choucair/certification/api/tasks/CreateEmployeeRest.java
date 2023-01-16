package co.com.choucair.certification.api.tasks;

import co.com.choucair.certification.api.interaction.ConsumeService;
import co.com.choucair.certification.api.model.ModelCreateEmployeeRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateEmployeeRest implements Task {

    private List<ModelCreateEmployeeRest> modelCreateEmployeeRest;

    public CreateEmployeeRest(List<ModelCreateEmployeeRest> modelCreateEmployeeRest) {
        this.modelCreateEmployeeRest = modelCreateEmployeeRest;
    }
    public static CreateEmployeeRest with(List<ModelCreateEmployeeRest> modelCreateEmployeeRests) {
        return Tasks.instrumented(CreateEmployeeRest.class, modelCreateEmployeeRests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("HOLAAA " + modelCreateEmployeeRest.get(0).toString());
        actor.attemptsTo(ConsumeService.withPost(modelCreateEmployeeRest.get(0).toString()));
    }
}
