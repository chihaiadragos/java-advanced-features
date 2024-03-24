package LeetCode.findtheDuplicateNumber287;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
        System.out.println(findDuplicate(new int[]{3,1,3,4,2}));
        System.out.println(findDuplicate(new int[]{3,3,3,3,3}));
    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
            if(nums[i] == nums[i+1]) return nums[i];
        return -1;
    }
}