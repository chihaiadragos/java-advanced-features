package DesignPatternsAndGoodPractices.Factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerType type, String RAM, String HDD) {
        if (ComputerType.PC.equals(type)) {
            return new PC(RAM, HDD);
        } else if (ComputerType.SERVER.equals(type)){
            return new Server(RAM, HDD);
        }
        return new Computer() {
            @Override
            public String getRAM() {
                return "Unknown";
            }

            @Override
            public String getHDD() {
                return "Unknown";
            }
        };
    }
}
