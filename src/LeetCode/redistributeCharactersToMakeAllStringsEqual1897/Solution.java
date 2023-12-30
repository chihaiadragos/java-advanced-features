package LeetCode.redistributeCharactersToMakeAllStringsEqual1897;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        String[] num1 = {"abc","aabc","bc"};
//        String[] num2 = {"ab","a"};
//        String[] num3 = {"ab"};
//        String[] num4 = {"a"};
//        String[] num5 = {"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"};
//        String[] num6 = {"a", "b", "c"};
//        String[] num7 = {"abc","cba"};
        String[] num8 = {"a", "a", "a"};

//        System.out.println(makeEqual(num1));
//        System.out.println(makeEqual(num2));
//        System.out.println(makeEqual(num3));
//        System.out.println(makeEqual(num4));
//        System.out.println(makeEqual(num5));
//        System.out.println(makeEqual(num6));
//        System.out.println(makeEqual(num7));
        System.out.println(makeEqual(num8));
    }
    public static boolean makeEqual(String[] words) {
        if (words.length == 1) {
            return true;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (!map.containsKey(word.charAt(j))) {
                    map.put(word.charAt(j), 1);
                } else {
                    map.replace(word.charAt(j), map.get(word.charAt(j)) + 1);
                }
            }
        }

//        double sum = map.values()
//                .stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//        double mean = sum / map.values().size();
//        if (map.values().stream().findFirst().isPresent()) {
//            int firstElement = map.values().stream().findFirst().get();
//            if (firstElement == 1 && map.values().stream().allMatch(element -> element.equals(firstElement))) {
//                return false;
//            }
//            return map
//                    .values()
//                    .stream()
//                    .allMatch(element -> element.equals(firstElement));
//        }
        for (int i = 0; i < words.length-1; i++) {
            if (words[i].length() == words[i+1].length() && words[i].equals(words[i+1]) && words[i].length() > 1)
                return false;
        }
        List<Integer> values = new ArrayList<>(map.values());
        if (map.keySet().size() == 1 && values.get(0) % words.length == 0){
            return true;
        }
        int valuesListSize = map.values().size();
        return map.values()
                .stream()
                .allMatch(value -> value % valuesListSize == 0);
    }
}
