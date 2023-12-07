package DesignPatternsAndGoodPractices.Factory;

public class PC extends Computer{
    private String pcRAM;
    private String pcHDD;

    public PC(String ram, String hdd) {
        this.pcRAM = ram;
        this.pcHDD = hdd;
    }

    @Override
    public String getRAM() {
        return pcRAM;
    }

    @Override
    public String getHDD() {
        return pcHDD;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PC {");
        sb.append("RAM = '").append(pcRAM).append('\'');
        sb.append(", HDD = '").append(pcHDD).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
