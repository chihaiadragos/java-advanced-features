package DesignPatternsAndGoodPractices.Factory;

public class Main {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer("Pc", "500", "500MB");
        Computer server = ComputerFactory.getComputer("SerVer", "8000", "5TB");
        Computer item = ComputerFactory.getComputer("baubau", "8000", "5TB");

        System.out.println(computer);
        System.out.println(server);
        System.out.println(item);
    }
}
