package DesignPatternsAndGoodPractices.Builder.Coding.Builder2;

public class Main {
    public static void main(String[] args) {
        //coffe varianta1
        Coffe coffe1 = new Coffe.CoffeBuilder("Cappuccino").withSugar(true).withMilk(false).size("medium").build();
        System.out.println(coffe1);

        //coffe2 varianta2
        //set single responsibility :(
        Coffe2 coffe2 = new Coffe2("Mocha").setWithMilk(true).setSize("small");
        System.out.println(coffe2);
    }
}
