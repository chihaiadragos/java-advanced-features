package LeetCode.assignCookies455;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Example 1 output: ");
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println();
        System.out.println("Example 2 output: ");
        System.out.println(findContentChildren(new int[]{1, 1}, new int[]{1, 2, 3}));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int cursor_A = 0;
        int cursor_B = 0;

        while (cursor_A < g.length && cursor_B < s.length) {
            if (g[cursor_A] <= s[cursor_B]) {
                cursor_A++;
                cursor_B++;
            } else {
                cursor_B++;
            }
        }
        return cursor_A;
    }
}
