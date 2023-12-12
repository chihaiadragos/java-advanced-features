package LeetCode.maximumProductOfTwoElementsInAnArray1464;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;
        for (int num : nums) {
            if (num>first) {
                second = first;
                first = num;
            } else if(num > second) {
            second = num;
        }
    }
        return (first-1)*(second-1);
}
}