package DesignPatternsAndGoodPractices.AbstractFactory;

public class ServerFactory implements ComputerAbstractFactory{
    private String RAM;
    private String HDD;

    public ServerFactory(String RAM, String HDD) {
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer makeComputer() {
        return new Server(this.RAM, this.HDD);
    }
}
