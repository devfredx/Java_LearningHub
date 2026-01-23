public class Customer {
    private String name;
    private Vehicle vehicle;

    public Customer(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer: " + name);
        System.out.println("Type: " + vehicle.getVehicleType());
        System.out.println("Vehicle Details: " + vehicle.getDetails());
        System.out.println("-------------------------");
    }
}