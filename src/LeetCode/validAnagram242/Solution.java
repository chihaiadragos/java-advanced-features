package LeetCode.validAnagram242;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t) {

        if (sortString(s).equals(sortString(t)))
            return true;

        return false;

    }
    public static String sortString(String stringToConvert)
    {
        char[] aux = stringToConvert.toCharArray();
        Arrays.sort(aux);
        return new String(aux);
    }
}
