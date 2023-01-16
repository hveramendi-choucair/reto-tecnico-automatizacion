package co.com.choucair.certification.api.util.enums;

public enum RestService {
    BASE_URL("https://dummy.restapiexample.com/api/v1"),
    CREATE_EMPLOYEE("/create");
    private String uri;

    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
