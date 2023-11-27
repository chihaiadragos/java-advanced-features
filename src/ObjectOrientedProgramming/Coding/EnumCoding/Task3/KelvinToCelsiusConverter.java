package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public class KelvinToCelsiusConverter implements Converter{
    @Override
    public float conver(float temp) {
        return (float) (temp - 273.15);
    }
}
