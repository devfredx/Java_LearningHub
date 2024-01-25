import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            Account account = new Account(accountNumber);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully");
        } else {
            System.out.println("Account already exists");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n===== Simple Bank Application =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    bank.createAccount(accountNumber);
                    break;
                case 2:
                    performTransaction(scanner, bank, "deposit");
                    break;
                case 3:
                    performTransaction(scanner, bank, "withdraw");
                    break;
                case 4:
                    checkBalance(scanner, bank);
                    break;
                case 5:
                    System.out.println("Exiting application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void performTransaction(Scanner scanner, Bank bank, String transactionType) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to " + transactionType + ": $");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            if ("deposit".equals(transactionType)) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        } else {
            System.out.println("Account not found. Please create an account first.");
        }
    }

    private static void checkBalance(Scanner scanner, Bank bank) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            account.displayBalance();
        } else {
            System.out.println("Account not found. Please create an account first.");
        }
    }
}
