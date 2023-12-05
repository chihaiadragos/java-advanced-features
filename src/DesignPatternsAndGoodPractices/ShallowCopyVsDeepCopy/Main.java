package DesignPatternsAndGoodPractices.ShallowCopyVsDeepCopy;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "black");
        //shallow copy
        Car car2 = car1;
        car1.setColor("white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println("==============================");
        //deep copy
        Car car3 = new Car().setColor(car1.getColor()).setName(car1.getName());
//        car3.setColor(car1.getColor());
//        car3.setName(car1.getName());
        car3.setName("RangeRover");
        car3.setColor("purple");

        System.out.println(car3);
    }
}
