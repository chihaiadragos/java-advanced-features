package DesignPatternsAndGoodPractices.Decorator;

public class Main {
    public static void main(String[] args) {
        Car sportCar1 = new SportCar(new BasicCar());
        sportCar1.assemble();
        System.out.println();
        Car luxuryCar1 = new LuxuryCar(new BasicCar());
        luxuryCar1.assemble();
        System.out.println();
        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
        System.out.println();
        Car luxurySportCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxurySportCar.assemble();
        System.out.println();
    }
}
