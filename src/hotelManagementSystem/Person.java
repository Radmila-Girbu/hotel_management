package hotelManagementSystem;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Address addressPerson;
    private String phoneNumber;
    private IdentityCard identityCard;
    private Role role;

    public Person(String firstName, String lastName, Address addressPerson, String phoneNumber, IdentityCard identityCard, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressPerson = addressPerson;
        this.phoneNumber = phoneNumber;
        this.identityCard = identityCard;
        this.role = role;
    }

    public Person(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public Address getAddressPerson() {
        return addressPerson;
    }

    public void setAddressPerson(Address addressPerson) {
        this.addressPerson = addressPerson;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
