package LeetCode.changeVariablesWithNoAux;

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a = a + b;
        System.out.println("a = " + a);
        b = a - b;
        System.out.println("b = " + b);
        a = a - b;
        System.out.println();
        System.out.println("a = " + a + " AND b = " + b);
    }


}
