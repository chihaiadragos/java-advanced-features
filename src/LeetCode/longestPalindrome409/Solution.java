package LeetCode.longestPalindrome409;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {

        HashSet<Character> charSet = new HashSet<>();

        int length = 0;


        for (char c : s.toCharArray()) {

            if (charSet.contains(c)) {
                charSet.remove(c);
                length += 2;
            } else {

                charSet.add(c);
            }
        }

        if (!charSet.isEmpty()) {
            length += 1;
        }
        return length;
    }
}