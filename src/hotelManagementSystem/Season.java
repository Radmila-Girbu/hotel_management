package hotelManagementSystem;

import java.text.DateFormat;

public enum Season {
    IN_SEASON(2.0),
    EXTRA_SEASON(1.2),
    REGULAR_SEASON(1.0);

    Season(double priceRate) {
    }
}
