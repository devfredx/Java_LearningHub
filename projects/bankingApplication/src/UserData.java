import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final Map<String, Double> accounts = new HashMap<>();
    private static final Map<String, String> passwords = new HashMap<>();
    private static final Map<String, String> accountCodes = new HashMap<>();

    static {
        // Initializing with predefined accounts, passwords, and account codes
        accounts.put("fred", 4613.0);
        passwords.put("fred", "123");
        accountCodes.put("fred", "6213");

        accounts.put("ellie", 8245.0);
        passwords.put("ellie", "456");
        accountCodes.put("ellie", "4371");
    }

    public static Map<String, Double> getAccounts() {
        return accounts;
    }

    public static Map<String, String> getPasswords() {
        return passwords;
    }

    public static Map<String, String> getAccountCodes() {
        return accountCodes;
    }
}
