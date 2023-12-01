package ExercisesForLiveCodingAdvanced.Exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Java", 18);
        items.put("Spring", 1);
        items.put("PHP", 100);
        items.put("CSS", 0);

        printHashMapElements(items);

    }
    public static void printHashMapElements(HashMap<String, Integer> hashMap) {
        Map<String, Integer> newHashMap = Map.copyOf(hashMap);
        Iterator<Map.Entry<String, Integer>> new_Iterator = newHashMap.entrySet().iterator();
        StringBuilder stringBuilder;

        while (new_Iterator.hasNext()) {
            Map.Entry<String, Integer> newMap = new_Iterator.next();
            stringBuilder = new StringBuilder("Key: " + newMap.getKey() + ", Values: " + newMap.getValue());
            if (new_Iterator.hasNext()) {
                stringBuilder.append(",");
            } else {
                stringBuilder.append(".");
            }
            System.out.println(stringBuilder);
        }
    }
}
