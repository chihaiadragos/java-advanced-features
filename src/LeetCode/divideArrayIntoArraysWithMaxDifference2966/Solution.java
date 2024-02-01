package LeetCode.divideArrayIntoArraysWithMaxDifference2966;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2)));
        System.out.println(Arrays.deepToString(divideArray(new int[]{1, 3, 3, 2, 7, 3}, 3)));
    }
    public static int[][] divideArray(int[] nums, int k) {
        if (nums.length % 3 != 0) {
            return new int[][] {};
        }
        Arrays.sort(nums);
        int[][] ans = new int[nums.length / 3][3];
        for (int i = 0; i < nums.length - 2; i = i + 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[][] {};
            }
        }
        int index = 0;
        for (int i = 0; i < nums.length / 3; i++) {
            for (int j = 0; j < 3; j++) {
                ans[i][j] = nums[index];
                index++;
            }
        }
        return ans;
    }
}
