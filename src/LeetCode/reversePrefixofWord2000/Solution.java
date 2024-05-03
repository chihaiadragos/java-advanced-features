package LeetCode.reversePrefixofWord2000;

class Solution {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }
    public static String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if (j != -1) {
            return new StringBuilder(word.substring(0, j + 1)).reverse().toString() + word.substring(j + 1);
        }
        return word;
    }
}
