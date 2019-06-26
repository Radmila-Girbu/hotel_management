package hotelManagementSystem;

public class Hotel {
    private int numberRoom;
    private Contact contact;

    public void addHotel(int numberRoom, Contact contact){
        this.setNumberRoom(numberRoom);
        this.setContact(contact);
    }

    public void displayHotelInfo(){
        System.out.println("NumberRooms: " + getNumberRoom());
        System.out.println("PhoneNumber:" + getContact().getPhoneNumber());
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}