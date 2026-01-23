public class Main {
    public static void main(String[] args) {

        WorkshopManager manager = new WorkshopManager();

        Customer c1 = new Customer("Engin", new Car("34ABC123", "Toyota"));
        Customer c2 = new Customer("Derin", new Motorcycle("06XYZ99", "Honda"));

        manager.registerJob(c1);
        manager.registerJob(c2);

        manager.showAllActiveJobs();
    }
}