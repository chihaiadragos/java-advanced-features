package LeetCode.determineIfStringHalvesAreAlike1704;

import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
    }
    public static boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();
        int left=0,right=ch.length-1;

        int lcount=0,rcount=0;
        Set vowels=Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        while(left<right){
            lcount += vowels.contains(ch[left])?1:0;
            rcount += vowels.contains(ch[right]) ? 1:0;
            left++;
            right--;
        }

        return lcount == rcount;
    }
}
