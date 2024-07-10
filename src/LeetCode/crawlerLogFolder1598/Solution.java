package LeetCode.crawlerLogFolder1598;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
    }
    public static int minOperations(String[] logs) {
        Stack<String> paths_stack = new Stack<>();

        for (String log : logs) {
            if (log.equals("../")) {
                if (!paths_stack.isEmpty()) {
                    paths_stack.pop();
                }
            } else if (!log.equals("./")) {
                paths_stack.push(log);
            }
        }

        return paths_stack.size();
    }
}