import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        // Corrected: Declare 'engin' as a Customer variable
        Customer engin = new Customer(1, "Engin", "Demirog");
        customers.add(engin);

        customers.add(new Customer(2, "Derin", "Demirog"));
        customers.add(new Customer(3, "Salih", "Demirog"));

        customers.remove(engin);

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}