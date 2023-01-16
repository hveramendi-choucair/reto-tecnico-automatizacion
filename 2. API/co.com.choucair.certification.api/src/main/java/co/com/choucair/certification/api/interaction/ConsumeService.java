package co.com.choucair.certification.api.interaction;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeService {
    private ConsumeService(){
    }
    public static WithPost withPost(String body) {
        //System.out.println("HEEE " + body);
        return Tasks.instrumented(WithPost.class, body);
    }
}
