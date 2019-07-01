package hotelManagementSystem;

public class Address {
    private String country;
    private String city;
    private String street;
    private int number;
    private String postalCode;

    public Address(String country, String city, String street, short number, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
