package hotelManagementSystem;

public class Customer extends Person{
    private String email;

    public Customer(String firstName, String lastName, Address adressPerson, Contact contactPerson, IdentityCard identityCard, String email) {
        super(firstName, lastName, adressPerson, contactPerson, identityCard);
        this.email = email;
    }
public Customer(){

}
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
