package LeetCode.numberofSeniorCitizens2678;

class Solution {
    public static void main(String[] args) {
        System.out.println(countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }
    public static int countSeniors(String[] details) {
        int ans = 0;
        for (var x : details) {
            int age = Integer.parseInt(x.substring(11, 13));
            if (age > 60) {
                ++ans;
            }
        }
        return ans;
    }
}