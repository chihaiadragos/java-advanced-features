package DesignPatternsAndGoodPractices.FactoryMethod;

public class ConcreteCreatorB implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }

}
