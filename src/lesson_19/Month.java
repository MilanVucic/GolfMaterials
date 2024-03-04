package lesson_19;

public enum Month {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");

    private String shortName;

    Month(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public int getNumberOfDays(boolean isLeapYear) {
        int days = -1;

        switch (this) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER:
                days = 31;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER:
                days = 30;
                break;
            case FEBRUARY:
                days = isLeapYear ? 29 : 28;
                break;
        }

        return days;
    }
}
