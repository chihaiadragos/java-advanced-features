package DesignPatternsAndGoodPractices.Prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype 1");
        ConcretePrototype prototype2 = new ConcretePrototype("Prototype 2");

        PrototypeManager manager = new PrototypeManager();
        manager.addPrototype("Prototype1Key", prototype1);
        manager.addPrototype("Prototype2Key", prototype2);

        Prototype clonedPrototype1 = manager.getPrototype("Prototype1Key");
        Prototype clonedPrototype2 = manager.getPrototype("Prototype2Key");

        ((ConcretePrototype) clonedPrototype1).setData("Modified Prototype 1");
        ((ConcretePrototype) clonedPrototype2).setData("Modified Prototype 2");

        System.out.println("Original Prototype 1: " + prototype1.getData());
        System.out.println("Cloned Prototype 1: " + ((ConcretePrototype) clonedPrototype1).getData());
        System.out.println("Original Prototype 2: " + prototype2.getData());
        System.out.println("Cloned Prototype 2: " + ((ConcretePrototype) clonedPrototype2).getData());
    }
}
