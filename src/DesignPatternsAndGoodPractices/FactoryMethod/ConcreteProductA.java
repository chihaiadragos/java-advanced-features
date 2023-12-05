package DesignPatternsAndGoodPractices.FactoryMethod;

public class ConcreteProductA implements Product{
    @Override
    public void create() {
        System.out.println("Creating Product A");
    }
}
