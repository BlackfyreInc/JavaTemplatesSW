package T_3_1;

public class Account {

    enum AccessType {
        Admin,
        User
    }

    final private AccessType accessType;
    final private String login;
    final private String password;

    private Account(AccessType accessType, String login, String password) {
        this.accessType = accessType;
        this.login = login;
        this.password = password;
    }

    public static Account createAdmin(String login, String password){
        return new Account(AccessType.Admin, login, password);
    }
    public static Account createUser(String login, String password){
        return new Account(AccessType.User, login, password);
    }
    public AccessType getAccessType() {
        return accessType;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
