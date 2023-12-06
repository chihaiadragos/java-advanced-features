package DesignPatternsAndGoodPractices.Adapter;

public class Eagle implements BirdAction{
    @Override
    public void fly() {
        System.out.println("Eagle fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Aw aw");
    }
}
