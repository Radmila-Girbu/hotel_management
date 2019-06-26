package hotelManagementSystem;

public class User extends Person {

    private Role role;
    private String password;
    private String login;

    public User(String firstName, String lastName, Address adressPerson, Contact contactPerson, IdentityCard identityCard, Role role, String password, String login) {
        super(firstName, lastName, adressPerson, contactPerson, identityCard);
        this.role = role;
        this.password = password;
        this.login = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
