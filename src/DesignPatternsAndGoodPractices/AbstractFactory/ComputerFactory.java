package DesignPatternsAndGoodPractices.AbstractFactory;



public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.makeComputer();
    }
}
