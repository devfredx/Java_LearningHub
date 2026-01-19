import java.util.Map;
import java.util.Scanner;

public class Transactions {
    private final Map<String, Double> accounts;
    private final String accountNumber;

    public Transactions(Map<String, Double> accounts, String accountNumber) {
        this.accounts = accounts;
        this.accountNumber = accountNumber;
    }

    public void performTransaction(String transactionType) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to " + transactionType + ": $");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if ("deposit".equals(transactionType)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    private void deposit(double amount) {
        double currentBalance = accounts.get(accountNumber);
        currentBalance += amount;
        accounts.put(accountNumber, currentBalance);
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    private void withdraw(double amount) {
        double currentBalance = accounts.get(accountNumber);
        if (currentBalance >= amount) {
            currentBalance -= amount;
            accounts.put(accountNumber, currentBalance);
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
        displayBalance();
    }

    private void displayBalance() {
        Double balance = accounts.get(accountNumber);
        if (balance != null) {
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void performBankTransactionsLoop() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Banking Transactions =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    performTransaction("deposit");
                    break;
                case 2:
                    performTransaction("withdraw");
                    break;
                case 3:
                    displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting banking transactions. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.print("\nDo you want to take another action (y/n): ");
            String continueOption = scanner.nextLine().toLowerCase();
            if (!continueOption.equals("y")) {
                System.out.println("\nExiting application. Good day!");
                System.exit(0);
            }
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
