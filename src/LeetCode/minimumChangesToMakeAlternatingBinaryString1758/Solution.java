package LeetCode.minimumChangesToMakeAlternatingBinaryString1758;

public class Solution {
    public static void main(String[] args) {
        String s = "10010100";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        if (s.length() == 1) {
            return 0;
        }
        int min1 = 0;
        int min2 = 0;
        char[] aux1 = s.toCharArray();
        char[] aux2 = s.toCharArray();
        if (isAlternating(aux1)) {
            return 0;
        }
        int i = 0;
        while (!isAlternating(aux1)) {
            if (true) {
                if (aux1[0] != '1'){
                    min1++;
                }
                aux1[0] = '1';
                if (aux1[i] == aux1[i + 1]) {
                    aux1[i + 1] = change(aux1[i + 1]);
                    min1++;
                }
                i++;
                if (i == aux1.length - 1) {
                    break;
                }

            }
        }
        int j =0;
        while (!isAlternating(aux2)){
            if (true){
                if (aux2[0] != '0'){
                    min2++;
                }
                aux2[0] = '0';
                if (aux2[j] == aux2[j+1]) {
                    aux2[j+1] = change(aux2[j+1]);
                    min2++;
                }
                j++;
                if (j == aux2.length-1) {
                    break;
                }
            }
        }

        if (min1 < min2) {
            return min1;
        }
        return min2;

    }

    public static boolean isAlternating(char[] s) {
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
