package DesignPatternsAndGoodPractices.Adapter;

public class PlasticToyDuck implements ToyBirdAction{
    @Override
    public void squeak() {
        System.out.println("Squeak Squeak");
    }
}
