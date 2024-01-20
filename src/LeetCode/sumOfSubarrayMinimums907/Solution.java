package LeetCode.sumOfSubarrayMinimums907;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[]{3, 1, 2, 4}));
        System.out.println(sumSubarrayMins(new int[]{11, 81, 94, 43, 3}));
    }
    public static int sumSubarrayMins(int[] arr) {
        int len = arr.length;
        int[] leftNextSmaller = findLeftNextSmaller(arr, len);
        int[] rightNextSmaller = findRightNextSmaller(arr, len);
        int mod = 1000000007;
        long totalSum = 0;
        for (int i = 0; i < len; i++) {
            long leftDistance = i - leftNextSmaller[i];
            long rightDistance = rightNextSmaller[i] - i;
            long totalWays = leftDistance * rightDistance;
            long currSum = totalWays * arr[i];
            totalSum = (totalSum + currSum) % mod;
        }
        return (int)totalSum;
    }
    private static int[] findLeftNextSmaller(int[] arr, int len) {
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                result[i] = -1;
            }
            else {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    stack.pop();
                }
                result[i] = (!stack.isEmpty()) ? stack.peek() : -1;
            }
            stack.push(i);
        }
        return result;
    }
    private static int[] findRightNextSmaller(int[] arr, int len) {
        int[] result = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result[i] = len;
            }
            else {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                result[i] = (!stack.isEmpty()) ? stack.peek() : len;
            }
            stack.push(i);
        }
        return result;
    }
}
