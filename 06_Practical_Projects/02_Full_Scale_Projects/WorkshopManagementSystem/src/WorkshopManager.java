import java.util.ArrayList;
import java.util.List;

public class WorkshopManager {
    private List<Customer> activeJobs;

    public WorkshopManager() {
        this.activeJobs = new ArrayList<>();
    }

    public void registerJob(Customer customer) {
        activeJobs.add(customer);
        System.out.println("[SYSTEM] New job registered for: " + customer.getName());
    }

    public void showAllActiveJobs() {
        System.out.println("\n--- CURRENT ACTIVE JOBS ---");
        if (activeJobs.isEmpty()) {
            System.out.println("No active jobs at the moment.");
        } else {
            for (Customer c : activeJobs) {
                c.displayCustomerInfo();
            }
        }
        System.out.println("---------------------------\n");
    }
}