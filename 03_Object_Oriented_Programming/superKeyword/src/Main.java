class Device {
    String type = "Electronic Device";

    Device(String brand) {
        System.out.println("Device brand: " + brand);
    }

    void turnOn() {
        System.out.println("The device is powered on.");
    }
}

class Smartphone extends Device {
    String type = "Smartphone";

    Smartphone() {
        super("Apple");
    }

    void displayTypes() {
        System.out.println("Current class type: " + type);
        System.out.println("Parent class type: " + super.type);
    }

    @Override
    void turnOn() {
        super.turnOn();
        System.out.println("Smartphone OS is loading...");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        myPhone.displayTypes();
        myPhone.turnOn();
    }
}