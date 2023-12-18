package ObjectOrientedProgramming.Coding.EnumCoding.homeWorkMetricConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println(MetricConverter.convertLengthUnit("M", "KM", 12345));
        System.out.println(MetricConverter.convertLengthUnit("MM", "KM", 12345));
        System.out.println(MetricConverter.convertLengthUnit("CM", "KM", 12345));
    }
}
