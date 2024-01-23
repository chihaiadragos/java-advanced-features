package LeetCode.maximumLengthofaConcatenatedStringWithUniqueCharacters1239;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("un");
        list1.add("iq");
        list1.add("ue");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("cha");
        list2.add("r");
        list2.add("act");
        list2.add("ers");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("abcdefghijklmnopqrstuvwxyz");

        System.out.println(maxLength(list1));
        System.out.println(maxLength(list2));
        System.out.println(maxLength(list3));
    }
    public static int maxLength(List<String> arr) {
        List<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            if (!hasUniqueChars(str)) {
                continue;
            }
            List<String> currList = new ArrayList<>();
            for (String s : result) {
                StringBuilder sb = new StringBuilder();
                sb.append(s).append(str);
                if (hasUniqueChars(sb.toString())) {
                    currList.add(sb.toString());
                }
            }
            result.addAll(currList);
        }
        int maxLen = 0;
        for (String str : result) {
            int currLen = str.length();
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }
        return maxLen;
    }
    private static boolean hasUniqueChars(String str) {
        boolean[] visited = new boolean[26];
        for (char ch : str.toCharArray()) {
            if (visited[ch - 'a']) {
                return false;
            }
            else {
                visited[ch - 'a'] = true;
            }
        }
        return true;
    }
}