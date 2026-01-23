import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkshopManager manager = new WorkshopManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== WELCOME TO MECHANIC WORKSHOP SYSTEM ===");

        while (running) {
            System.out.println("\n1. Register New Car");
            System.out.println("2. Register New Motorcycle");
            System.out.println("3. Show All Active Jobs");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Boşluk hatasını önlemek için

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String carOwner = scanner.nextLine();
                    System.out.print("Enter Car Brand: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Enter License Plate: ");
                    String carPlate = scanner.nextLine();

                    manager.registerJob(new Customer(carOwner, new Car(carPlate, carBrand)));
                    break;

                case 2:
                    System.out.print("Enter Customer Name: ");
                    String motoOwner = scanner.nextLine();
                    System.out.print("Enter Moto Brand: ");
                    String motoBrand = scanner.nextLine();
                    System.out.print("Enter License Plate: ");
                    String motoPlate = scanner.nextLine();

                    manager.registerJob(new Customer(motoOwner, new Motorcycle(motoPlate, motoBrand)));
                    break;

                case 3:
                    manager.showAllActiveJobs();
                    break;

                case 4:
                    running = false;
                    System.out.println("System shutting down... Have a great day!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }
}