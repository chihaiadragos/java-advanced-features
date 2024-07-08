package LeetCode.waterBottles1518;

class Solution {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;

        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }

        return totalBottles;
    }
}