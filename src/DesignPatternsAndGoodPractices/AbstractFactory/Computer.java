package DesignPatternsAndGoodPractices.AbstractFactory;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    @Override
    public String toString() {
        return "RAM: " + getRAM() + ", HDD: " + getHDD();
    }
}
