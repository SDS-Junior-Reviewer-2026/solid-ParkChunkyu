package greeter;

public class DefaultGreeterString implements GreeterString {
    @Override
    public String getGreetString() {
        return "Hello.";
    }
}
