import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Double> accounts = UserData.getAccounts();
    private static final Map<String, String> passwords = UserData.getPasswords();
    private static final Map<String, String> accountCodes = UserData.getAccountCodes();

    // Add InputUtil class directly here
    private static class InputUtil {
        private static final Scanner scanner = new Scanner(System.in);

        public static int getIntInput() {
            return scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        // Greeting and displaying initial account information
        System.out.println("Welcome to the Simple Bank Application!");
        displayInitialAccounts();

        // Asking the user whether to log in or create a new account
        System.out.println("\nWould you like to log in with an existing account or create a new account?");
        System.out.println("1. Log in\n2. Create a new account");
        System.out.print("Choose an option: ");
        int option = InputUtil.getIntInput();

        LoginProcess loginProcess = new LoginProcess(accounts, passwords, accountCodes);

        switch (option) {
            case 1:
                loginProcess.performLogin();
                break;
            case 2:
                loginProcess.performAccountCreation();
                break;
            default:
                System.out.println("Invalid option. Exiting application. Goodbye!");
                break;
        }
    }

    private static void displayInitialAccounts() {
        System.out.println("Account Information:");
        accounts.forEach((account, balance) ->
                System.out.println("Account: " + account + ", Balance: $" + balance));
    }
}
