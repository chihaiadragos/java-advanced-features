package LeetCode.reverseSubstringsBetweenEachPairofParentheses1190;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public static void main(String[] args) {
        System.out.println(reverseParentheses("(u(love)i))"));
        System.out.println(reverseParentheses("(ed(et(oc))el)"));
    }
    public static String reverseParentheses(String s) {
        Deque<Integer> indStack = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        for (char char_s : s.toCharArray()) {
            if (char_s == '(') {
                indStack.push(res.length());
            } else if (char_s == ')') {
                int startInd = indStack.pop();
                String reversed = new StringBuilder(res.substring(startInd)).reverse().toString();
                res.replace(startInd, res.length(), reversed);
            } else {
                res.append(char_s);
            }
        }

        return res.toString();
    }
}