package LeetCode.countTripletsThatCanFormTwoArraysofEqualXOR1442;

class Solution {
    public static void main(String[] args) {
        System.out.println(countTriplets(new int[]{2,3,1,6,7}));
    }
    public static int countTriplets(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = 0;
                for (int k = i; k < j; k++) {
                    a ^= arr[k];
                }

                int b = 0;
                for (int k = j; k < n; k++) {
                    b ^= arr[k];
                    if (a == b) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}