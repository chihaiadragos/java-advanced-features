package LeetCode.pathCrossing1496;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String path1 = "NES";
        String path2 = "NESWW";

        System.out.println(isPathCrossing(path1));
        System.out.println();
        System.out.println(isPathCrossing(path2));

    }
    public static boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        String key = x + "$" + y;
        set.add(key);

        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }

            key = x + "$" + y;

            if (set.contains(key)) {
                return true;
            }
            set.add(key);
        }
        return false;
    }
}
