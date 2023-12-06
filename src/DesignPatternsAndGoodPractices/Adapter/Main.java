package DesignPatternsAndGoodPractices.Adapter;

public class Main {
    public static void main(String[] args) {
        Flamingo flamingo = new Flamingo();
        System.out.println("Flamingo:");
        flamingo.makeSound();
        System.out.println();

        Eagle eagle = new Eagle();

        PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
        System.out.println("PlasticDuck:");
        plasticToyDuck.squeak();
        System.out.println();

        BirdAdapter toyFlamingo = new BirdAdapter(flamingo);
        System.out.println("ToyFlamingo:");
        toyFlamingo.squeak();
        System.out.println();

        BirdAdapter toyEagle = new BirdAdapter(eagle);
        System.out.println("ToyEagle:");
        toyEagle.squeak();
        System.out.println();
    }
}
