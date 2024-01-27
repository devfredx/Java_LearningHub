import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to Bank Application!\n");


        UserData userData = new UserData();
        Map<String, Double> accounts = userData.getAccounts();
        displayInitialAccounts(accounts);


        int option;
        while (true) {
            System.out.println("\n1. Log in\n2. Create a new account\nx. Exit");
            System.out.print("Choose an option: ");
            String userInput = InputUtil.getInput();

            if (userInput.equalsIgnoreCase("x")) {
                System.out.println("\nExiting application. Good day!");
                System.exit(0);
            }

            try {
                option = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("\nInput not available. Please enter a valid option❗");
                continue;
            }

            if (option == 1 || option == 2) {
                break;
            } else {
                System.out.println("\nInput not available. Please enter a valid option❗");
            }
        }

        LoginProcess loginProcess = new LoginProcess(accounts, userData.getPasswords(), userData.getAccountCodes());

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

    private static void displayInitialAccounts(Map<String, Double> accounts) {
        System.out.println("Account Information:");
        accounts.forEach((account, balance) ->
                System.out.println("Account: " + account + ", Balance: $" + balance));
    }
}
