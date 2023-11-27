package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class KelvinToFahrenheitConverter implements Converter{
    @Override
    public float conver(float temp) {
        return (float) (temp * 1.8 - 459.67);
    }
}
