package DesignPatternsAndGoodPractices.ShallowCopyVsDeepCopy;

public class Car {
    private String name;
    private String color;
    public Car() {

    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
