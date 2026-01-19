import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation number:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("5. Exit\n: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    performAddition(num1, num2);
                    break;
                case 2:
                    performSubtraction(num1, num2);
                    break;
                case 3:
                    performMultiplication(num1, num2);
                    break;
                case 4:
                    performDivision(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }
    }

    // Void operations for different arithmetic operations
    private static void performAddition(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }
    }
}
