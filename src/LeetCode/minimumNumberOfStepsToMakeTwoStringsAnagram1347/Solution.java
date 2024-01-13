package LeetCode.minimumNumberOfStepsToMakeTwoStringsAnagram1347;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minSteps("bab","aba"));
        System.out.println(minSteps("leetcode","practice"));
        System.out.println(minSteps("anagram","mangaar"));
    }
    public static int minSteps(String s, String t) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        int res = 0;
        for (int count : counts) {
            if (count > 0) {
                res += count;
            }
        }
        return res;
    }
}
