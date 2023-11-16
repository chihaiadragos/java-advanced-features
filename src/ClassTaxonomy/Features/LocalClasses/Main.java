package ClassTaxonomy.Features.LocalClasses;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(createPair("A", i));
        }
    }

    public static int createPair(String key, int value) {
        class Pair {
            String key;
            int value;
        }
        Pair pair = new Pair();
        pair.key = key;
        pair.value = value;
        return pair.value;
    }


}
