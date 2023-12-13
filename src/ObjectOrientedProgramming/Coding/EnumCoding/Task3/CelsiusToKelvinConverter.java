package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class CelsiusToKelvinConverter implements Converter{
    @Override
    public float convert(float temp) {
        return (float) (temp + 273.15);
    }
}
