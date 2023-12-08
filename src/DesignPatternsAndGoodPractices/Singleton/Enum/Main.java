package DesignPatternsAndGoodPractices.Singleton.Enum;

public class Main {
    public static void main(String[] args) {
        SimpleSingletonExample simpleCounterA = SimpleSingletonExample.INSTANCE;
        SimpleSingletonExample simpleCounterB = SimpleSingletonExample.INSTANCE;
        System.out.println(simpleCounterA == simpleCounterB);

        simpleCounterA.increment();
        simpleCounterB.increment();
        System.out.println(simpleCounterA.getCurrentCount());
    }
}
