package hotelManagementSystem;

public class Customer extends Person{


    public Customer(String firstName, String lastName, Address addressPerson, Contact contactPerson, IdentityCard identityCard, Role role) {
        super(firstName, lastName, addressPerson, contactPerson, identityCard, role);
    }

    public Customer() {
    }
}
