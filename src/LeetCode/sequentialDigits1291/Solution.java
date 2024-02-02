package LeetCode.sequentialDigits1291;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(100, 300));
        System.out.println(sequentialDigits(1000, 13000));
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> result = new ArrayList<>();
        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();
        for (int left = lowLength; left <= highLength; left++) {
            for (int right = 0; right <= digits.length() - left; right++) {
                String seqString = digits.substring(right, right + left);
                int num = Integer.parseInt(seqString);
                if (num >= low && num <= high) {
                    result.add(num);
                }
                if (num > high) {
                    break;
                }
            }
        }
        return result;
    }
}
