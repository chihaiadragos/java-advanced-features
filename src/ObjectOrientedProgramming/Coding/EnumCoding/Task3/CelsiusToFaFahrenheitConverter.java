package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class CelsiusToFaFahrenheitConverter implements Converter{
    @Override
    public float convert(float temp) {
        return (float) (temp * 1.8 + 32);
    }
}
