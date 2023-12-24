package LeetCode.minimumChangesToMakeAlternatingBinaryString1758;

public class Solution2 {
    public static void main(String[] args) {
        String s = "10010100";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) == '1') {
                x++;
            } else if (i % 2 == 1 && s.charAt(i) == '0') {
                x++;
            }
            if (i % 2 == 0 && s.charAt(i) == '0') {
                y++;
            } else if (i % 2 == 1 && s.charAt(i) == '1'){
                y++;
            }
        }
        return Math.min(x, y);
    }
}
