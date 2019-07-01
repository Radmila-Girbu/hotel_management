package hotelManagementSystem;

public enum MonthSeason  {
    JANUARY(Season.REGULAR_SEASON),
    FEBRUARY(Season.REGULAR_SEASON),
    MARCH(Season.EXTRA_SEASON),
    APRIL(Season.EXTRA_SEASON),
    MAY(Season.EXTRA_SEASON),
    JUNE(Season.IN_SEASON),
    JULY(Season.IN_SEASON),
    AUGUST(Season.IN_SEASON),
    SEPTEMBER(Season.EXTRA_SEASON),
    OCTOBER(Season.REGULAR_SEASON),
    NOVEMBER(Season.REGULAR_SEASON),
    DECEMBER(Season.REGULAR_SEASON);


    MonthSeason(Season extraSeason) {
    }
}
