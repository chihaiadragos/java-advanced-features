package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class FahrenheitToCelsiusConverter implements Converter{
    @Override
    public float conver(float temp) {
        return (temp - 32) * 5 / 9;
    }
}
