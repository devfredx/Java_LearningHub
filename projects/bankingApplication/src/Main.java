import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Bank Application!");


        UserData userData = new UserData();
        Map<String, Double> accounts = userData.getAccounts();
        displayInitialAccounts(accounts);


        System.out.println("\nWould you like to log in with an existing account or create a new account?");
        System.out.println("1. Log in\n2. Create a new account");
        System.out.print("Choose an option: ");
        int option = InputUtil.getIntInput();

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
