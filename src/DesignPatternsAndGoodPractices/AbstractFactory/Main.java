package DesignPatternsAndGoodPractices.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2048MHz", "900GB"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16000MHz", "10TB"));

        System.out.println(pc);
        System.out.println(server);
    }

}
