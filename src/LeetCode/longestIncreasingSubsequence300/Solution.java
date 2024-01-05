package LeetCode.longestIncreasingSubsequence300;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        System.out.println(lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
    public static int lengthOfLIS(int[] nums) {
        int[] T = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]){
                    if (T[j] + 1 > T[i]){
                        T[i] = T[j] + 1;
                    }
                }
            }
        }

        int maxIndex = 0;
        for (int i = 0; i < T.length; i++){
            if (T[i] > T[maxIndex]){
                maxIndex = i;
            }
        }
        return T[maxIndex] + 1;
    }
}
