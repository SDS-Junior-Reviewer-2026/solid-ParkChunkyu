package birds;

public class Eagle implements Bird, FlyableBird {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }
}