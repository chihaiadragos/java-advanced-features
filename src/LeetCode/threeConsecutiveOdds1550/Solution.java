package LeetCode.threeConsecutiveOdds1550;

class Solution {
    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        if(arr == null || arr.length == 0) {
            return false;
        }
        int consecutiveOddCount = 0;
        for(int number: arr){
            if(number%2 == 1){
                consecutiveOddCount++;
            } else {
                consecutiveOddCount = 0;
            }
            if(consecutiveOddCount == 3){
                return true;
            }
        }
        return false;
    }
}