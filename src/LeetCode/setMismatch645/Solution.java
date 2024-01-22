package LeetCode.setMismatch645;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
    }
    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int[] result = new int[2];

        for (int i:nums){
            arr[i-1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                result[0]=i+1;
            }
            if (arr[i]==0){
                result[1] = i+1;
            }
        }
        return result;
    }
}
