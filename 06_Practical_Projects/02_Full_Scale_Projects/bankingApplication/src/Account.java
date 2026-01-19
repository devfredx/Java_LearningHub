public class Account {
    private String username;
    private String password;
    private String accountCode;
    private double balance;

    public Account(String username, String password, String accountCode, double balance) {
        this.username = username;
        this.password = password;
        this.accountCode = accountCode;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
