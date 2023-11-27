package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class Main {
    public static void main(String[] args) throws ConvertorNotFoundException {
        System.out.println(TemperatureConvert.convertTemperature('c', 'f', 100));
        System.out.println(TemperatureConvert.convertTemperature('c', 'k', 100));
        System.out.println(TemperatureConvert.convertTemperature('k', 'c', 100));
        System.out.println(TemperatureConvert.convertTemperature('f', 'c', 100));
        System.out.println(TemperatureConvert.convertTemperature('f', 'k', 100));
        System.out.println(TemperatureConvert.convertTemperature('k', 'f', 100));
    }
}
