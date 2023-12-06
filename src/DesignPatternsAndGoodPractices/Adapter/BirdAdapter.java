package DesignPatternsAndGoodPractices.Adapter;

public class BirdAdapter implements ToyBirdAction{
    public BirdAction bird;
    public BirdAdapter(BirdAction birdAction) {
        this.bird = birdAction;
    }
    @Override
    public void squeak() {
        bird.makeSound();
    }
}
