package hotelManagementSystem;

public class Room {

    private int number;
    private String typeOfRoom;
    private String view;
    private  String occupiedStatus;
    private PriceRate price;

    public Room(int number, String typeOfRoom, String view, String occupiedStatus, PriceRate price) {
        this.number = number;
        this.typeOfRoom = typeOfRoom;
        this.view = view;
        this.occupiedStatus = occupiedStatus;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getOccupiedStatus() {
        return occupiedStatus;
    }

    public void setOccupiedStatus(String occupiedStatus) {
        this.occupiedStatus = occupiedStatus;
    }

    public PriceRate getPrice() {
        return price;
    }

    public void setPrice(PriceRate price) {
        this.price = price;
    }
}
