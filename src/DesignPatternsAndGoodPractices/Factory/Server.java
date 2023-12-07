package DesignPatternsAndGoodPractices.Factory;

public class Server extends Computer{
    private String serverRAM;
    private String serverHDD;

    public Server(String ram, String hdd) {
        this.serverRAM = ram;
        this.serverHDD = hdd;
    }

    @Override
    public String getRAM() {
        return serverRAM;
    }

    @Override
    public String getHDD() {
        return serverHDD;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Server {");
        sb.append("RAM = '").append(serverRAM).append('\'');
        sb.append(", HDD = '").append(serverHDD).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
