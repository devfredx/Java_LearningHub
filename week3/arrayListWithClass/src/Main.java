import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer.engin = new Customer(1, "Engin", "susan");
        customers.add(engin);

        // customers.add(new Customer(1, "Engin", "susan"));
        customers.add(new Customer(2, "Derin", "susan"));
        customers.add(new Customer(3, "Salih", "susan"));

        customers.remove(new Customer(1, "Engin", "susan"));
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}