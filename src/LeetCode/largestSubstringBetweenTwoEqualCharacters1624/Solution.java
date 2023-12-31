package LeetCode.largestSubstringBetweenTwoEqualCharacters1624;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String a = "aa";
        String b = "abca";
        String c = "abcd";

        System.out.println(maxLengthBetweenEqualCharacters(a));
        System.out.println(maxLengthBetweenEqualCharacters(b));
        System.out.println(maxLengthBetweenEqualCharacters(c));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max = Integer.MIN_VALUE;

        //for case string = "aa";
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return 0;
        }

        //for case string = "abcd" <- all unique
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] mom = s.toCharArray();
        for (char ch : mom) {
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, 1);
            } else {
                hashMap.replace(ch, hashMap.get(ch) + 1);
            }
        }
        if (hashMap.values().stream().allMatch(element -> element.equals(1))) {
            return -1;
        }

        //for a case that is possible to have a substring string = "abca";
        char[] num = s.toCharArray();
        String aux = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (num[i] == num[j]){
                    aux = s.substring(i, j-1);
                    if (aux.length() > max) {
                        max = aux.length();
                    }
                }
            }
        }
        return max;
    }
}
