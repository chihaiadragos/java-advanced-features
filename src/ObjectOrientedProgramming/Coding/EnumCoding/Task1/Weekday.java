package ObjectOrientedProgramming.Coding.EnumCoding.Task1;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isHoliday(Weekday weekday) {
        return weekday == SATURDAY || weekday == SUNDAY;
    }
    boolean isWeekDay(Weekday weekday) {
        return isHoliday(weekday);
    }


}
