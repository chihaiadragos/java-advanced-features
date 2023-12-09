package DesignPatternsAndGoodPractices.Coding.Task5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog.Builder().withName("Azorel").build();
        System.out.println(dog1);
        dog1.getToys().add("minge");
        dog1.getToys().add("os");
        System.out.println(dog1);
        System.out.println(dog1.getToys());
    }
}
