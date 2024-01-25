import java.util.HashMap;
import java.util.Map;

public class UserData {
    private final Map<String, Double> accounts;
    private final Map<String, String> passwords;
    private final Map<String, String> accountCodes;

    public UserData() {

        accounts = new HashMap<>();
        passwords = new HashMap<>();
        accountCodes = new HashMap<>();


        accounts.put("fred", 4613.0);
        passwords.put("fred", "123");
        accountCodes.put("fred", "6213");

        accounts.put("ellie", 8245.0);
        passwords.put("ellie", "456");
        accountCodes.put("ellie", "4371");
    }

    public Map<String, Double> getAccounts() {
        return accounts;
    }

    public Map<String, String> getPasswords() {
        return passwords;
    }

    public Map<String, String> getAccountCodes() {
        return accountCodes;
    }
}
