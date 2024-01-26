package LeetCode.outOfBoundaryPaths576;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(findPaths(2,2,2,0,0));
        System.out.println(findPaths(1,3,3,0,1));
    }
    static final int mod = 1000000007;
    static int[][][] dp;
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(m, n, maxMove, startRow, startColumn, 0);
    }
    private static int helper(int m, int n, int maxMove, int i, int j, int moves) {
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return 1;
        }
        if (moves == maxMove) {
            return 0;
        }
        if (dp[i][j][moves] != -1) {
            return dp[i][j][moves];
        }
        int count = 0;
        count = (count + helper(m, n, maxMove, i + 1, j, moves + 1)) % mod;
        count = (count + helper(m, n, maxMove, i - 1, j, moves + 1)) % mod;
        count = (count + helper(m, n, maxMove, i, j + 1, moves + 1)) % mod;
        count = (count + helper(m, n, maxMove, i, j - 1, moves + 1)) % mod;
        return dp[i][j][moves] = count % mod;
    }
}