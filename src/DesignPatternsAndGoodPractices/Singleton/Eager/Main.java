package DesignPatternsAndGoodPractices.Singleton.Eager;

public class Main {
    public static void main(String[] args) {
        SimpleCounter simpleCounterA = SimpleCounter.getInstance();
        SimpleCounter simpleCounterB = SimpleCounter.getInstance();
        System.out.println(simpleCounterA == simpleCounterB); // true -> both references point to the same object

        simpleCounterA.increment();
        simpleCounterB.increment();
        System.out.println(simpleCounterA.getCurrentCount()); // 2
    }
}
