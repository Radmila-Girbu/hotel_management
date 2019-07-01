package hotelManagementSystem;

public class IdentityCard {
    private String cnp;
    private String serial;
    private int number;
    private String dateIssuingIC;
    private String dateExpiringIC;

    public IdentityCard(String cnp, String serial, short number, String dateIssuingIC, String dateExpiringIC) {
        this.cnp = cnp;
        this.serial = serial;
        this.number = number;
        this.dateIssuingIC = dateIssuingIC;
        this.dateExpiringIC = dateExpiringIC;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDateIssuingIC() {
        return dateIssuingIC;
    }

    public void setDateIssuingIC(String dateIssuingIC) {
        this.dateIssuingIC = dateIssuingIC;
    }

    public String getDateExpiringIC() {
        return dateExpiringIC;
    }

    public void setDateExpiringIC(String dateExpiringIC) {
        this.dateExpiringIC = dateExpiringIC;
    }
}
