package LeetCode.partitionArrayForMaximumSum1043;


import java.util.Arrays;

//Method 2 - Bottom up
class Solution2 {
    public static void main(String[] args) {
        System.out.println(maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3));
        System.out.println(maxSumAfterPartitioning(new int[]{1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3}, 4));
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, 0);
        for (int start = arr.length - 1; start >= 0; start--) {
            int currMax = 0;
            int end = Math.min(arr.length, start + k);
            for (int i = start; i < end; i++) {
                currMax = Math.max(currMax, arr[i]);
                dp[start] = Math.max(dp[start], currMax * (i - start + 1) + dp[i + 1]);
            }
        }
        return dp[0];
    }
}
