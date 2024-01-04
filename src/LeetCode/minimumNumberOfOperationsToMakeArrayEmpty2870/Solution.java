package LeetCode.minimumNumberOfOperationsToMakeArrayEmpty2870;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4}));
        System.out.println(minOperations(new int[]{2, 1, 2, 2, 3, 3}));
    }
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        for (int key : map.keySet()) {
            int val = map.get(key);

            if (val == 1) {
                return -1;
            } else {
                while (val > 0) {
                    val -= 3;
                    ans++;
                }
            }
        }

        return ans;
    }
}
