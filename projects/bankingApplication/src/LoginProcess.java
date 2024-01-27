import java.util.Map;
import java.util.Scanner;

public class LoginProcess {
    private final Map<String, Double> accounts;
    private final Map<String, String> passwords;
    private final Map<String, String> accountCodes;

    public LoginProcess(Map<String, Double> accounts, Map<String, String> passwords, Map<String, String> accountCodes) {
        this.accounts = accounts;
        this.passwords = passwords;
        this.accountCodes = accountCodes;
    }

    public void performLogin() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account name: ");
            String accountName = scanner.nextLine();

            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            boolean isAccountNameCorrect = accountName.equals("fred") || accountName.equals("ellie");
            boolean isAccountNumberCorrect = accountNumber.equals("6213") || accountNumber.equals("4371");
            boolean isPasswordCorrect = password.equals("123") || password.equals("456");

            if (isAccountNameCorrect && isAccountNumberCorrect && isPasswordCorrect) {
                System.out.println("Login successful. Welcome, " + accountName + "!");

                Transactions transactions = new Transactions(accounts, accountNumber);
                transactions.performBankTransactionsLoop();
                break;
            } else {
                System.out.println("Incorrect input(s).");
                System.out.println("1. Try again\n2. x for exit");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("x")) {
                    System.out.println("Exiting application. Goodbye!");
                    System.exit(0);
                }
            }
        }
    }

    public void performAccountCreation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired account number: ");
        String newAccountNumber = scanner.nextLine();
        System.out.print("Enter desired account code: ");
        String newAccountCode = scanner.nextLine();
        System.out.print("Enter desired password: ");
        String newPassword = scanner.nextLine();
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();
        accounts.put(newAccountNumber, initialBalance);
        passwords.put(newAccountNumber, newPassword);
        accountCodes.put(newAccountNumber, newAccountCode);

        System.out.println("Account created successfully");
        displayBalance(newAccountNumber);

        Transactions transactions = new Transactions(accounts, newAccountNumber);
        transactions.performBankTransactionsLoop();
    }
    private void displayBalance(String accountNumber) {
        System.out.println("Current Balance: $" + accounts.get(accountNumber));
    }
    private void performBankTransactionsLoop(Transactions transactions) {
        while (true) {
            System.out.println("\n===== Banking Transactions =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = InputUtil.getIntInput();
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            switch (choice) {
                case 1:
                    transactions.performTransaction("deposit");
                    break;
                case 2:
                    transactions.performTransaction("withdraw");
                    break;
                case 3:
                    displayBalance(transactions.getAccountNumber());
                    break;
                case 4:
                    System.out.println("Exiting banking transactions. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.print("Do you want to continue with another transaction? (y/n): ");
            String continueOption = scanner.nextLine().toLowerCase();
            if (!continueOption.equals("y")) {
                System.out.println("Exiting banking transactions. Goodbye!");
                System.exit(0);
            }
        }
    }

    private boolean validateLogin(String accountNumber, String enteredAccountCode, String enteredPassword) {
        return accountCodes.containsKey(accountNumber) &&
                passwords.containsKey(accountNumber) &&
                accountCodes.get(accountNumber).equals(enteredAccountCode) &&
                passwords.get(accountNumber).equals(enteredPassword);
    }
}
