package DesignPatternsAndGoodPractices.Singleton;

public class ConexiuneBazaDeDateSingleton {
    private static ConexiuneBazaDeDateSingleton INSTANCE;
    private String field;
    private ConexiuneBazaDeDateSingleton() {
        this.field = "Conexiune Singleton";
    }
    public static ConexiuneBazaDeDateSingleton getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new ConexiuneBazaDeDateSingleton();
        }
        return INSTANCE;
    }


    @Override
    public String toString() {
        return "ConexiuneBazaDeDateSingleton{" +
                "field='" + field + '\'' +
                '}';
    }
}
