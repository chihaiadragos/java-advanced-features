package ObjectOrientedProgramming.Coding.EnumCoding.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Weekday.FRIDAY.isWeekDay(Weekday.SUNDAY));
        System.out.println(Weekday.FRIDAY.isHoliday(Weekday.MONDAY));
    }
}
