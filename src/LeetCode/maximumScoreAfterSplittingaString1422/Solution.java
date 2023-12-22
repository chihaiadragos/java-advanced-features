package LeetCode.maximumScoreAfterSplittingaString1422;

public class Solution {
    public static void main(String[] args) {
        String input = "011101";
        System.out.println(maxScore(input));
    }
    public static int maxScore(String s) {
        int maxScore = 0;
        int leftScore = 0;
        int rightScore = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                rightScore++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                rightScore--;
            } else {
                leftScore++;
            }
            if (maxScore < rightScore + leftScore) {
                maxScore = rightScore + leftScore;
            }
        }
        return maxScore;
    }
}
