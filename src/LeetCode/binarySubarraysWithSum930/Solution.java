package LeetCode.binarySubarraysWithSum930;

class Solution {
    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{1,0,1,0,1}, 2));
        System.out.println(numSubarraysWithSum(new int[]{0,0,0,0,0}, 0));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int i = 0, count = 0, res = 0;
        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] == 1) {
                goal--;
                count = 0;
            }

            while (goal == 0 && i <= j) {
                goal += nums[i];
                i++;
                count++;
                if (i > j - goal + 1)
                    break;
            }

            while (goal < 0) {
                goal += nums[i];
                i++;
            }

            res += count;
        }
        return res;
    }
}