package LeetCode.scoreofaString3110;

public class Solution {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }
    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
}