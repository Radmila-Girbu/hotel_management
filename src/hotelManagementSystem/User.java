package hotelManagementSystem;

public class User extends Person {


    private String password;
    private String login;


    public User(String firstName, String lastName, Address addressPerson, String phoneNumber, IdentityCard identityCard, Role role, String password, String login) {
        super(firstName, lastName, addressPerson, phoneNumber, identityCard, role);
        this.password = password;
        this.login = login;
    }

    public User(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
