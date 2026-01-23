public abstract class Vehicle {
    private String licensePlate;
    private String brand;

    public Vehicle(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    public abstract String getVehicleType();

    public String getDetails() {
        return brand + " [" + licensePlate + "]";
    }
}