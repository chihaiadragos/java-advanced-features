package LeetCode.boatstoSavePeople881;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1,2}, 3));
    }
    public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if((people[j]+people[i])<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
}
