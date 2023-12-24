package LeetCode.minimumChangesToMakeAlternatingBinaryString1758;

public class Solution {
    public static void main(String[] args) {
        String s = "10010100";
        System.out.println(minOperations(s));

    }
    public static int minOperations(String s) {
        int min = 0;
        char[] aux = s.toCharArray();
        if (isAlternating(aux)) {
            return 0;
        }
        int i = 0;
        while (!isAlternating(aux)) {
            if (aux[i] == aux[i+1]) {
                aux[i+1] = change(aux[i+1]);
                min++;
            }
            i++;
            if (i == aux.length-1) {
                return min;
            }
        }
        return min;
    }

    public static boolean isAlternating(char[] s) {
        if (s == null || s.length <= 1) {
            return false;
        }
        if (s.length == 2) {
            return true;
        }
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] == s[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static char change(char c) {
        char aux = '0';
        if (c == '0') {
            aux = '1';
        }
        return aux;
    }
}
