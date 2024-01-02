package LeetCode.convertAnArrayIntoA2DArrayWithConditions2610;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(findMatrix(nums1));
        System.out.println(findMatrix(nums2));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length + 1];
        List<List<Integer>> ans = new ArrayList<>();
        for (int num : nums) {
            if (freq[num] >= ans.size()) {
                ans.add(new ArrayList<>());
            }
            ans.get(freq[num]).add(num);
            freq[num]++;
        }
        return ans;
    }
}
