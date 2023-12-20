package LeetCode.buyTwoChocolates2706;

class Solution {
    public static void main(String[] args) {
        int[] prices = {3,2,3}; int money = 3;
        System.out.println(buyChoco(prices, money));
    }
    public static int buyChoco(int[] prices, int money) {
        int min1 = 101;
        int min2 = 101;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min1) {
                min2 = min1;
                min1 = prices[i];
            } else if (prices[i] < min2) {
                min2 = prices[i];
            }
        }

        if ((min1 + min2) <= money) {
            return money - (min1 + min2);
        }
        return money;
    }
}