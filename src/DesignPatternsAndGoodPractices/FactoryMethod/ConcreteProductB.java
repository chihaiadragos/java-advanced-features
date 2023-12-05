package DesignPatternsAndGoodPractices.FactoryMethod;

public class ConcreteProductB implements Product{
    @Override
    public void create() {
        System.out.println("Creating Product B");
    }
}
