package LeetCode.redistributeCharactersToMakeAllStringsEqual1897;

public class Solution2 {
    public static void main(String[] args) {
        String[] num1 = {"abc","aabc","bc"};
        String[] num2 = {"ab","a"};
        String[] num3 = {"ab"};
        String[] num4 = {"a"};
        String[] num5 = {"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"};
        String[] num6 = {"a", "b", "c"};
        String[] num7 = {"abc","cba"};
        String[] num8 = {"a", "a", "a"};

        System.out.println(makeEqual(num1));
        System.out.println(makeEqual(num2));
        System.out.println(makeEqual(num3));
        System.out.println(makeEqual(num4));
        System.out.println(makeEqual(num5));
        System.out.println(makeEqual(num6));
        System.out.println(makeEqual(num7));
        System.out.println(makeEqual(num8));
    }
    public static boolean makeEqual(String[] words) {
        int[] counter = new int[26];
        for (String w : words){
            for (char ch : w.toCharArray()) {
                counter[ch - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (counter[i] % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
