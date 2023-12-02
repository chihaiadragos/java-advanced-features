package ExercisesForLiveCodingAdvanced.Exercise6;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Charmander", 10);
        treeMap.put("Bulbasaur", 5);
        treeMap.put("Snorlax", 8);
        System.out.println(treeMap);

        printFirstAndLastEntry(treeMap);
    }
    public static <K, V> void printFirstAndLastEntry(TreeMap<K, V> treeMap) {
        if (treeMap.isEmpty()) {
            System.out.println("The TreeMap is empty.");
            return;
        }

        Map.Entry<K, V> firstEntry = treeMap.firstEntry();
        Map.Entry<K, V> lastEntry = treeMap.lastEntry();

        System.out.println("First Entry: " + firstEntry);
        System.out.println("Last Entry: " + lastEntry);
    }
}
