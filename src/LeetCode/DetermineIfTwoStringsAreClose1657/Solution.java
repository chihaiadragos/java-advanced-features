package LeetCode.DetermineIfTwoStringsAreClose1657;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
        System.out.println(closeStrings("a", "aa"));
        System.out.println(closeStrings("cabbba", "abbccc"));
    }
    public static boolean closeStrings(String word1, String word2) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (char c : word1.toCharArray()) {
            counts1[c - 'a']++;
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            counts2[c - 'a']++;
            set2.add(c);
        }
        Arrays.sort(counts1);
        Arrays.sort(counts2);
        return set1.equals(set2) && Arrays.equals(counts1, counts2);
    }
}
