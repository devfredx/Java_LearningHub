public class BankApplication {
    private UserData userData;

    public BankApplication() {
        this.userData = new UserData();
    }

    public void start() {
        displayInitialAccounts();
        LoginProcess loginProcess = new LoginProcess(userData.getAccounts(), userData.getPasswords(), userData.getAccountCodes());
        loginProcess.initiateLogin();
    }

    private void displayInitialAccounts() {
        System.out.println("Account Information:");
        userData.getAccounts().forEach((username, account) ->
                System.out.println("Username: " + username + ", Balance: $" + account.getBalance()));
    }
}
