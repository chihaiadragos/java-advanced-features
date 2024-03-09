package LeetCode.minimumCommonValue2540;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3}, new int[]{2,4}));
        System.out.println(getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums1) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (mp.containsKey(num) && mp.get(num) > 0) {
                return num;
            }
        }
        return -1;
    }
}

