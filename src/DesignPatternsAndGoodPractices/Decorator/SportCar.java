package DesignPatternsAndGoodPractices.Decorator;

public class SportCar extends CarDecorator{
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + [adding features of <SPORT> car]");
    }

    public SportCar(Car car) {
        super(car);
    }
}
