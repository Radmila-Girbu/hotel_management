package hotelManagementSystem;

public class Apartment extends Room {
    private String dotateKitchen;
    private int numberRooms;

    public Apartment(int number, String typeOfRoom, String view, String occupiedStatus, int price, String dotateKitchen, int numberRooms) {
        super(number, typeOfRoom, view, occupiedStatus, price);
        this.dotateKitchen = dotateKitchen;
        this.numberRooms = numberRooms;
    }

    public String getDotateKitchen() {
        return dotateKitchen;
    }

    public void setDotateKitchen(String dotateKitchen) {
        this.dotateKitchen = dotateKitchen;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

}
