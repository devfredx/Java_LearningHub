import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("Todo List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String newTask = scanner.next();
                    tasks.add(newTask);
                    System.out.println("Task added successfully!\n");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to mark as done.\n");
                    } else {
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter the task number to mark as done: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            System.out.println("Task '" + tasks.get(taskNumber - 1) + "' marked as done.\n");
                            tasks.remove(taskNumber - 1);
                        } else {
                            System.out.println("Invalid task number.\n");
                        }
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to display.\n");
                    } else {
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting Todo List. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
    }
}
