package LeetCode.calculateMoneyInLeetcodeBank1716;

public class Solution {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
    }
    public static int totalMoney(int n) {
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += (i / 7) + 1 + (i % 7);
        }
        return ans;
    }
}
