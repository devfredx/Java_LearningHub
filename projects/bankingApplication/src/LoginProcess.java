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

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter account code: ");
            String enteredAccountCode = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (validateLogin(accountNumber, enteredAccountCode, enteredPassword)) {
                System.out.println("Login successful. Welcome, " + accountNumber + "!");
                Transactions transactions = new Transactions(accounts, accountNumber);
                transactions.performBankTransactions();
            } else {
                System.out.println("Incorrect account code or password. Exiting application. Goodbye!");
            }
        } else {
            System.out.println("Account not found. Exiting application. Goodbye!");
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
        scanner.nextLine(); // Consume the newline character

        accounts.put(newAccountNumber, initialBalance);
        passwords.put(newAccountNumber, newPassword);
        accountCodes.put(newAccountNumber, newAccountCode);

        System.out.println("Account created successfully");
        displayBalance(newAccountNumber);
    }

    private boolean validateLogin(String accountNumber, String enteredAccountCode, String enteredPassword) {
        return accountCodes.containsKey(accountNumber) &&
                passwords.containsKey(accountNumber) &&
                accountCodes.get(accountNumber).equals(enteredAccountCode) &&
                passwords.get(accountNumber).equals(enteredPassword);
    }

    private void displayBalance(String accountNumber) {
        System.out.println("Current Balance: $" + accounts.get(accountNumber));
    }
}
