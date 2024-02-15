package LeetCode.findPolygonWiththeLargestPerimeter2971;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{5,5,5}));
        System.out.println(largestPerimeter(new int[]{1,12,1,2,5,50,3}));
        System.out.println(largestPerimeter(new int[]{5,5,50}));
    }
    public static long largestPerimeter(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}
