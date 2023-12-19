package LeetCode.maximumProductDifferenceBetweenTwoPairs1913;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int a = nums[nums.length-1];
        int b = nums[nums.length-2];

        int c = nums[0];
        int d = nums[1];

        return (a*b) - (c*d);
    }
}
