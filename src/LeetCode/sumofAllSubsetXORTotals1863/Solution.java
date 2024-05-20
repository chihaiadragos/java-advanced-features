package LeetCode.sumofAllSubsetXORTotals1863;

class Solution {
    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{1,3}));
        System.out.println(subsetXORSum(new int[]{5,1,6}));
    }
    public static int subsetXORSum(int[] nums) {
        // First create helper function, this function will help us to calculate
        // when i'm including, when i'm not. The XOR of that array
        return helper(nums, 0, 0); // nums, level, current XOR
    }
    public static int helper(int nums[], int level, int currentXOR){
        if(level == nums.length) return currentXOR;
        int include = helper(nums, level + 1, currentXOR^nums[level]);
        int exclude = helper(nums, level + 1, currentXOR);

        return include + exclude;
    }
}
