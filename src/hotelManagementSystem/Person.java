package hotelManagementSystem;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Address adressPerson;
    private Contact contactPerson;
    private IdentityCard identityCard;

    public Person(String firstName, String lastName, Address adressPerson, Contact contactPerson, IdentityCard identityCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adressPerson = adressPerson;
        this.contactPerson = contactPerson;
        this.identityCard = identityCard;
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

    public Address getAdressPerson() {
        return adressPerson;
    }

    public void setAdressPerson(Address adressPerson) {
        this.adressPerson = adressPerson;
    }

    public Contact getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Contact contactPerson) {
        this.contactPerson = contactPerson;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }
}
