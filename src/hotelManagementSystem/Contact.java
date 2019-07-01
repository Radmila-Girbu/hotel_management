package hotelManagementSystem;

public class Contact {
    private Address address;
    private String emailAddress;
    private String facebookPage;
    private String linkBooking;
    private String phoneNumber;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmailAdress() {
        return emailAddress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAddress = emailAdress;
    }

    public String getFacebookPage() {
        return facebookPage;
    }

    public void setFacebookPage(String facebookPage) {
        this.facebookPage = facebookPage;
    }

    public String getLinkBooking() {
        return linkBooking;
    }

    public void setLinkBooking(String linkBooking) {
        this.linkBooking = linkBooking;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
