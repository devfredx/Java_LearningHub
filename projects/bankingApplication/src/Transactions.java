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
        System.out.println("Current Balance: $" + accounts.get(accountNumber));
    }


    public String getAccountNumber() {
        return accountNumber;
    }
}
