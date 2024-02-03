package LeetCode.partitionArrayForMaximumSum1043;

import java.util.Arrays;

//Method 1 - Top Down
class Solution1 {
    public static void main(String[] args) {
        System.out.println(maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3));
        System.out.println(maxSumAfterPartitioning(new int[]{1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3}, 4));
    }
    static int[] dp;
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return helper(arr, k, 0);
    }
    private static int helper(int[] arr, int k, int start) {
        int len = arr.length;
        if (start >= len) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        int currMax = 0, ans = 0;
        int end = Math.min(len, start + k);
        for (int i = start; i < end; i++) {
            currMax = Math.max(currMax, arr[i]);
            ans = Math.max(ans, currMax * (i - start + 1) + helper(arr, k, i + 1));
        }
        return dp[start] = ans;
    }
}