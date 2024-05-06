package LeetCode.largestPositiveIntegerThatExistsWithItsNegative2441;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(findMaxK(new int[]{-1,2,-3,3}));
    }
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] > 0 && Arrays.binarySearch(nums, -nums[i]) >= 0) {
                return nums[i];
            }
        }
        return -1;  // If no such pair found
    }
}
