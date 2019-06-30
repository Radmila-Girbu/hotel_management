package hotelManagementSystem;

import java.util.Scanner;

public class KeyboardReader {
    private Scanner scanner;

    public KeyboardReader() {
        scanner = new Scanner(System.in);
    }

    public Season dateBook() {
        System.out.println();
        System.out.println("Input the month:");
        Scanner date = new Scanner(System.in);
        System.out.println("1. January");
        System.out.println("2. February");
        System.out.println("3. March");
        System.out.println("4. April");
        System.out.println("5. May");
        System.out.println("6. January");
        System.out.println("7. January");
        System.out.println("8. January");
        System.out.println("9. January");
        System.out.println("10. January");
        System.out.println("11. January");
        System.out.println("12. January");
        System.out.println("Introduceti cifra corespunzatoare lunei:");
        int month = date.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("In Season");
                return Season.IN_SEASON;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Low Season");
                return Season.LOW_SEASON;
            default:
                return Season.ERROR_SEASON;

        }
    }
}