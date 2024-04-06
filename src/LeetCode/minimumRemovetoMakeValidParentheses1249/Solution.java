package LeetCode.minimumRemovetoMakeValidParentheses1249;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
    }
    public static String minRemoveToMakeValid(String s) {
        int n = s.length();
        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(s.charAt(i)))
                continue;
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    vis[i] = true;
                }
            }
        }
        while (!st.isEmpty()) {
            vis[st.pop()] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!vis[i])
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
