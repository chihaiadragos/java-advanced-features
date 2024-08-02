package LeetCode.minimumSwapstoGroupAll1sTogetherII2134;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(minSwaps(new int[]{0,1,0,1,1,0,0}));
    }
    public static int minSwaps(int[] nums) {
        int k = Arrays.stream(nums).sum();
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < k; ++i) {
            cnt += nums[i];
        }
        int mx = cnt;
        for (int i = k; i < n + k; ++i) {
            cnt += nums[i % n] - nums[(i - k + n) % n];
            mx = Math.max(mx, cnt);
        }
        return k - mx;
    }
}