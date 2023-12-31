package LeetCode.largestSubstringBetweenTwoEqualCharacters1624;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        String a = "aa";
        String b = "abca";
        String c = "abcd";

        System.out.println(maxLengthBetweenEqualCharacters(a));
        System.out.println(maxLengthBetweenEqualCharacters(b));
        System.out.println(maxLengthBetweenEqualCharacters(c));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int largest = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                largest = Math.max(largest, i - map.get(c) -1);
            } else {
                map.put(c, i);
            }
        }
        return largest;
    }
}
