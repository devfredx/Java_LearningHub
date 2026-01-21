public class Constructors {
    String brand;
    String model;
    int year;
    double price;

    public Constructors() {
        brand = "Generic";
        model = "Basic";
        year = 2024;
        price = 0.0;
    }

    public Constructors(String carBrand, String carModel) {
        brand = carBrand;
        model = carModel;
    }

    public Constructors(String carBrand, String carModel, int carYear, double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        price = carPrice;
    }

    public void showDetails() {
        System.out.println("Car: " + brand + " " + model + " | Year: " + year + " | Price: $" + price);
    }

    public static void main(String[] args) {
        Constructors defaultCar = new Constructors();
        defaultCar.showDetails();

        Constructors simpleCar = new Constructors("Tesla", "Model 3");
        simpleCar.showDetails();

        Constructors premiumCar = new Constructors("Mercedes", "C200", 2023, 45000.50);
        premiumCar.showDetails();
    }
}