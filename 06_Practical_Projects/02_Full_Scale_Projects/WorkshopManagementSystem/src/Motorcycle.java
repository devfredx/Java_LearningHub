public class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate, String brand) {
        super(licensePlate, brand);
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}