package T_3_1;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        Map<String, String> adminAccounts = new HashMap<>();
        adminAccounts.put("Oualid", "ss");
        adminAccounts.put("UnsaltedSalt", "aa");

        Map<String, String> userAccounts = new HashMap<>();
        userAccounts.put("Jay3", "qq");
        userAccounts.put("Supertf", "ww");

        Account[] users = {
            Account.createAdmin("Oualid", "ss"),
            Account.createAdmin("UnsaltedSalt", "aa"),
            Account.createUser("Jay3", "qq"),
            Account.createUser("Supertf", "ww"),
        };

        AbstractAuthentication userAuthentication = new UserAuthentication();
        AbstractAuthentication administratorAuthenticationAuthentication = new AdminAuthentication();

        userAuthentication.setNextAuthentication(administratorAuthenticationAuthentication);
    }
}
