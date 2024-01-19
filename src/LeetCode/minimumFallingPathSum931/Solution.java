package LeetCode.minimumFallingPathSum931;

public class Solution {
    public static void main(String[] args) {
        int[][] a = new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int[][] b = new int[][]{{-19, 57}, {-40, -5}};
        System.out.println(a);
        System.out.println(b);
    }
    public static int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        for (int col = 0; col < cols; col++) {
            dp[0][col] = matrix[0][col];
        }
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int topLeft = Integer.MAX_VALUE, top = dp[row - 1][col], topRight = Integer.MAX_VALUE;
                if (col - 1 >= 0) {
                    topLeft = dp[row - 1][col - 1];
                }
                if (col + 1 < cols) {
                    topRight = dp[row - 1][col + 1];
                }
                dp[row][col] = matrix[row][col] + Math.min(Math.min(topLeft, top),topRight);
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < cols; col++) {
            minSum = Math.min(minSum, dp[rows - 1][col]);
        }
        return minSum;
    }
}
