package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class FahrenheitToCelsiusConverter implements Converter{
    @Override
    public float convert(float temp) {
        return (temp - 32) * 5 / 9;
    }
}
