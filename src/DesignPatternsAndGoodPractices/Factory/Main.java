package DesignPatternsAndGoodPractices.Factory;

public class Main {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer(ComputerType.PC, "500", "500MB");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "8000", "5TB");
        Computer item = ComputerFactory.getComputer(null, "8000", "5TB");

        System.out.println(computer);
        System.out.println(server);
        System.out.println(item);
    }
}
