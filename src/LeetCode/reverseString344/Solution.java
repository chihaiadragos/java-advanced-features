package LeetCode.reverseString344;

class Solution {
    public static void main(String[] args) {
        char[] chars = new char[]{'h','e','l','l','o'};
        reverseString(chars);
        System.out.println(chars);
    }
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}