package DesignPatternsAndGoodPractices.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        // Create instances using factory methods
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.create();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.create();
    }
}
