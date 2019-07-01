package hotelManagementSystem;

import java.time.LocalDate;

public class Booking {

    private Customer customer;
    private Room room;
    private LocalDate CheckIn;
    private int numberOfNights;
    private int numberAdults;
    private int numberChildren;
    private int numberInfants;

    public Booking(Customer customer, Room room, LocalDate checkIn, int numberOfNights, int numberAdults, int numberChildren, int numberInfants) {
        this.customer = customer;
        this.room = room;
        CheckIn = checkIn;
        this.numberOfNights = numberOfNights;
        this.numberAdults = numberAdults;
        this.numberChildren = numberChildren;
        this.numberInfants = numberInfants;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        CheckIn = checkIn;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getNumberAdults() {
        return numberAdults;
    }

    public void setNumberAdults(int numberAdults) {
        this.numberAdults = numberAdults;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }

    public int getNumberInfants() {
        return numberInfants;
    }

    public void setNumberInfants(int numberInfants) {
        this.numberInfants = numberInfants;
    }
}
