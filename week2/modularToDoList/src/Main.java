import java.util.ArrayList;
import java.util.Scanner;

class TodoItem {
    private String task;

    public TodoItem(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return task;
    }
}

class TodoList {
    private ArrayList<TodoItem> items;

    public TodoList() {
        items = new ArrayList<>();
    }

    public void addItem(String task) {
        TodoItem newItem = new TodoItem(task);
        items.add(newItem);
        System.out.println("Task added: " + task);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Todo list is empty.");
        } else {
            System.out.println("Todo List:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
        }
    }

    public void updateItem(int index, String newTask) {
        if (index >= 0 && index < items.size()) {
            items.get(index).setTask(newTask);
            System.out.println("Task updated: " + newTask);
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            String removedTask = items.get(index).getTask();
            items.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\nTodo List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Remove Task");
            System.out.print("5. Exit\n: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Todo List Application. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    scanner.nextLine();
                    String newTask = scanner.nextLine();
                    todoList.addItem(newTask);
                    break;
                case 2:
                    todoList.displayItems();
                    break;
                case 3:
                    System.out.print("Enter the index of the task to update: ");
                    int updateIndex = scanner.nextInt();
                    System.out.print("Enter the new task: ");
                    scanner.nextLine();
                    String updatedTask = scanner.nextLine();
                    todoList.updateItem(updateIndex - 1, updatedTask);
                    break;
                case 4:
                    System.out.print("Enter the index of the task to remove: ");
                    int removeIndex = scanner.nextInt();
                    todoList.removeItem(removeIndex - 1);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }
    }
}
