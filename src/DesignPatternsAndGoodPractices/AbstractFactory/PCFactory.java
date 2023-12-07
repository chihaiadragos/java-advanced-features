package DesignPatternsAndGoodPractices.AbstractFactory;

public class PCFactory implements ComputerAbstractFactory{
    private String RAM;
    private String HDD;

    public PCFactory(String RAM, String HDD) {
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer makeComputer() {
        return new PC(this.RAM, this.HDD);
    }
}
