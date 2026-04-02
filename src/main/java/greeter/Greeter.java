package greeter;

public class Greeter {
    String formality;

    private final GreeterStringFactory stringFactory = new GreeterStringFactory();

    public String greet() {
        GreeterString greeterString = stringFactory.createGreeterString(formality);
        return greeterString.getGreetString();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}