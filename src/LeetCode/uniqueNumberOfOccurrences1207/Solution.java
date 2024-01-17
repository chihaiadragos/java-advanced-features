package LeetCode.uniqueNumberOfOccurrences1207;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
        System.out.println(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> num_occurrences = new HashMap<>();
        for (int num : arr) {
            num_occurrences.put(num, num_occurrences.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> unique_vals = new HashSet<>(num_occurrences.values());
        return num_occurrences.size() == unique_vals.size();
    }
}
