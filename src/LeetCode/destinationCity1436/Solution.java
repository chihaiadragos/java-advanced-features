package LeetCode.destinationCity1436;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> pair1 = new ArrayList<>();
        pair1.add("A");
        pair1.add("B");
        List<String> pair2 = new ArrayList<>();
        pair2.add("B");
        pair2.add("C");
        List<String> pair3 = new ArrayList<>();
        pair3.add("C");
        pair3.add("D");
        paths.add(pair1);
        paths.add(pair2);
        paths.add(pair3);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);

        System.out.println(destCity(paths));

    }
    public static String destCity(List<List<String>> paths) {
        HashSet<String> destinationCity = new HashSet<>();
        for (List<String> pair : paths) {
            destinationCity.add(pair.get(0));
        }
        String finalDestination = "";
        for (List<String> pair : paths) {
            if (!destinationCity.contains(pair.get(1))){
                finalDestination = pair.get(1);
            }
        }
        return finalDestination;
    }
}
