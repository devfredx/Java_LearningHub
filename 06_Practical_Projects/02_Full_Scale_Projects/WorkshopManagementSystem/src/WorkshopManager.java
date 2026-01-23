import java.util.ArrayList;
import java.util.List;

public class WorkshopManager {
    private List<Customer> activeJobs;
    private RepairLogger logger; // Logger ekledik

    public WorkshopManager() {
        this.activeJobs = new ArrayList<>();
        this.logger = new RepairLogger(); // Başlattık
    }

    public void registerJob(Customer customer) {
        activeJobs.add(customer);
        System.out.println("[SYSTEM] New job registered for: " + customer.getName());

        logger.logNewJob(customer.getName(), "Vehicle details handled.");
    }

    public void showAllActiveJobs() {
        System.out.println("\n--- CURRENT ACTIVE JOBS ---");
        for (Customer c : activeJobs) {
            c.displayCustomerInfo();
        }
    }
}