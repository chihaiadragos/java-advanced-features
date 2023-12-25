package LeetCode.decodeWays91;

public class Solution {
    public static void main(String[] args) {
        String s1 = "12", s2 = "226", s3 = "06";

        System.out.println(numDecodings(s1));
        System.out.println(numDecodings(s2));
        System.out.println(numDecodings(s3));
    }
    public static int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int count1 = 1;
        int count2 = 1;

        for (int i = 1; i < s.length(); ++i) {
            int d = s.charAt(i) - '0';
            int dd = (s.charAt(i-1) - '0') * 10 + d;
            int count = 0;

            if (d > 0) {
                count += count2;
            }
            if (dd >= 10 && dd <= 26) {
                count += count1;
            }
            count1 = count2;
            count2 = count;
        }
        return count2;
    }
}
