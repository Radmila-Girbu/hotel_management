package hotelManagementSystem;

public class Apartment extends Room {
    private String kitchenAppliances;
    private int numberOfRooms;

    public Apartment(int number, String typeOfRoom, String view, String occupiedStatus, double price, String dotateKitchen, int numberRooms) {
        super(number, typeOfRoom, view, occupiedStatus, price);
        this.kitchenAppliances = kitchenAppliances;
        this.numberOfRooms = numberRooms;
    }

    public String getDotateKitchen() {
        return kitchenAppliances;
    }

    public void setDotateKitchen(String dotateKitchen) {
        this.kitchenAppliances = kitchenAppliances;
    }

    public int getNumberRooms() {
        return numberOfRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberOfRooms = numberRooms;
    }

}
