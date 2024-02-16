package LeetCode.leastNumberofUniqueIntegersafterKRemovals1481;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(findLeastNumOfUniqueInts(new int[]{5,5,4}, 1));
        System.out.println(findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3));
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int a : arr) mp.put(a, mp.getOrDefault(a, 0) + 1);

        List<Integer> v = new ArrayList<>();
        int cnt = 0;
        for (int a : mp.values()) {
            v.add(a);
        }

        Collections.sort(v);
        for (int i = 0; i < v.size(); i++) {
            if (k > v.get(i)) {
                k -= v.get(i);
                v.set(i, 0);
            } else {
                v.set(i, v.get(i) - k);
                k = 0;
            }
            if (v.get(i) != 0) cnt++;
        }
        return cnt;
    }
}
