package DesignPatternsAndGoodPractices.Decorator;

public class LuxuryCar extends CarDecorator{
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + [adding features of <LUXURY> car]");
    }

    public LuxuryCar(Car car) {
        super(car);
    }
}
