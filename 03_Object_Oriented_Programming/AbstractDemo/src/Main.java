public class Main {

    public static void main(String[] args) {

        Customer_Manager customer_Manager = new Customer_Manager();
        customer_Manager.databaseManager = new Oracle_DatabaseManager();
        customer_Manager.getCustomers();
    }
}
