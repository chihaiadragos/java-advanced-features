package ExercisesForLiveCodingAdvanced.Exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> map;

    public Storage() {
        this.map = new HashMap<>();
    }

    public void addToStorage(String key, String value){
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }
    public void printValues(String key) {
        for (String i : map.keySet()) {
            if (key.equals(i)){
                System.out.println(map.get(key));
            }
        }
    }

    public void findValues(String value) {
        for (String key : map.keySet()) {
            for (String val : map.get(key)) {
                if (value.equals(val)) {
                    System.out.println(key);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "map=" + map +
                '}';
    }
}
