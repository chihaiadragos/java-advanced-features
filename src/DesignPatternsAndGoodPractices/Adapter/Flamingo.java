package DesignPatternsAndGoodPractices.Adapter;

public class Flamingo implements BirdAction{
    @Override
    public void fly() {
        System.out.println("Flamingo can't fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Fla flamingo");
    }
}
