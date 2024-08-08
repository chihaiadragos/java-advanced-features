package LeetCode.minimumNumberofPushestoTypeWordII3016;

import java.util.Arrays;

import static java.util.Collections.reverseOrder;

class Solution {
    public static void main(String[] args) {
        System.out.println(minimumPushes("abcde"));
    }
    public static int minimumPushes(String word) {
        int[] letterFrequency = new int[26];
        for (char c : word.toCharArray()) {
            letterFrequency[c - 'a']++;
        }

        Integer[] sortedFreq = new Integer[26];
        for (int i = 0; i < 26; i++) {
            sortedFreq[i] = letterFrequency[i];
        }
        Arrays.sort(sortedFreq, reverseOrder());

        int totalPresses = 0;
        for (int i = 0; i < 26; i++) {
            if (sortedFreq[i] == 0) break;
            totalPresses += (i / 8 + 1) * sortedFreq[i];
        }

        return totalPresses;
    }
}