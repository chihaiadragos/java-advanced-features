package LeetCode.evaluateReversePolishNotation150;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int result = 0;
                if (token.equals("+")) {
                    result = num1 + num2;
                }
                else if (token.equals("-")) {
                    result = num1 - num2;
                }
                else if (token.equals("*")) {
                    result = num1 * num2;
                }
                else if (token.equals("/")) {
                    result = num1 / num2;
                }
                stack.push(Integer.toString(result));
            }
            else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }
    private static boolean isOperator(String str) {
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return true;
        }
        return false;
    }
}