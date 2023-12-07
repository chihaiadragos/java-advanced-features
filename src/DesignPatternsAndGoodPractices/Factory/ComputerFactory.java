package DesignPatternsAndGoodPractices.Factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String RAM, String HDD) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(RAM, HDD);
        } else if ("Server".equalsIgnoreCase(type)){
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
