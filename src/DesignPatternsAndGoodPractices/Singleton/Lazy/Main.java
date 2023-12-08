package DesignPatternsAndGoodPractices.Singleton.Lazy;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDateSingleton conexiune1 = ConexiuneBazaDeDateSingleton.getINSTANCE();
        System.out.println(conexiune1);
        ConexiuneBazaDeDateSingleton conexiune2 = ConexiuneBazaDeDateSingleton.getINSTANCE();
        System.out.println(conexiune2);
        System.out.println("Conexiune1 si conexiune2 au aceeasi adresa: " + conexiune1.equals(conexiune2));
    }
}
