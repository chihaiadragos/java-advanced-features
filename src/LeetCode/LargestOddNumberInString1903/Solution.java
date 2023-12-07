package LeetCode.LargestOddNumberInString1903;

public class Solution {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
    }
    public static String largestOddNumber(String num) {
        for(int i = num.length()-1;i>=0;i--){
            char c = num.charAt(i);
            if(c%2==1) {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
