package LeetCode.timeNeededtoBuyTickets2073;

class Solution {
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{2,3,2}, 2));
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return total;
    }
}
