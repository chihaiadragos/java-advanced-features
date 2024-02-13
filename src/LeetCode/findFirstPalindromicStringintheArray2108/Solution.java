package LeetCode.findFirstPalindromicStringintheArray2108;

public class Solution {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word).reverse();
            if (word.equals(reversed.toString())) {
                return word;
            }
        }
        return "";
    }
}
