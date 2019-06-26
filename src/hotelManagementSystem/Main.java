package hotelManagementSystem;

public class Main {
    public static void main(String[] args) {
        //Contact cnct = new Contact();

        Hotel hotel = new Hotel();
        hotel.addHotel(15, new Contact() );
        hotel.displayHotelInfo();

        System.out.println(hotel.getContact().getPhoneNumber());
        hotel.getContact().setPhoneNumber("9999999");
        System.out.println(hotel.getContact().getPhoneNumber());
    }
}
