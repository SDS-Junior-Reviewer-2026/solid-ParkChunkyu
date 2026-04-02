package greeter;

public class GreeterStringFactory {

    public GreeterString createGreeterString(String formality) {
        if (formality == null) { return new DefaultGreeterString(); }

        switch (formality) {
            case "formal":
                return new FormalGreeterString();
            case "casual":
                return new CasualGreeterString();
            case "intimate":
                return new IntimateGreeterString();
            default:
                return new DefaultGreeterString();
        }
    }
}
