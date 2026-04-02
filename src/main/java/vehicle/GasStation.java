package vehicle;

public class GasStation {

    public GasStation() {
    }

    public void reFuel(Vehicle vehicle) {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }

    public void addFuel(Vehicle vehicle, int amount) {
        vehicle.addRemainingFuel(amount);
    }
}
