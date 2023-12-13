package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class FahrenheitToKelvinConverter implements Converter{
    @Override
    public float convert(float temp) {
        return (float) ((temp + 459.67) / 1.8);
    }
}
