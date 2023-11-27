package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class FahrenheitToKelvinConverter implements Converter{
    @Override
    public float conver(float temp) {
        return (float) ((temp + 459.67) / 1.8);
    }
}
