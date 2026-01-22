public class Main {
    public static void main(String[] args) {

        displayMessage("Test Execution Started");

        greetUser("John", 25);
        greetUser("Alice", 30);

        int result = calculateSum(15, 25);
        System.out.println("Calculated Sum: " + result);

        boolean eligible = checkAccess(21);
        System.out.println("Access Status: " + eligible);

        System.out.println("Final Result: " + processData(10, "Multiplier"));
    }

    public static void displayMessage(String message) {
        System.out.println("System Notification: " + message);
    }

    public static void greetUser(String name, int age) {
        System.out.println("User: " + name + " | Age: " + age);
    }

    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    public static boolean checkAccess(int age) {
        return age >= 18;
    }

    public static String processData(int value, String label) {
        int processedValue = value * 2;
        return label + " processed to: " + processedValue;
    }
}