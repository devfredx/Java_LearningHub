public class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Car("34ABC123", "Toyota");
        Vehicle myMoto = new Motorcycle("06XYZ99", "Honda");

        Customer customer1 = new Customer("Engin", myCar);
        Customer customer2 = new Customer("Derin", myMoto);

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
    }
}