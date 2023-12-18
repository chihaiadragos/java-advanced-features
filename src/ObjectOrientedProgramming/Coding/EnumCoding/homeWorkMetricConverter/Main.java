package ObjectOrientedProgramming.Coding.EnumCoding.homeWorkMetricConverter;

public class Main {
    public static void main(String[] args) {
        float value = 12345f;
        String output = "KM";
        System.out.println(MetricConverter.convertLengthUnit("M", output, value));
        System.out.println(MetricConverter.convertLengthUnit("MM", output, value));
        System.out.println(MetricConverter.convertLengthUnit("CM", output, value));
    }
}
