package LeetCode.longestIncreasingSubsequence300;

public class Main {
    public static void main(String[] args) {
        long count = "aaaaaaaaabjjbaaaaaaaaabubisbaaaaaa".chars()
                .filter(c -> c == 'a')
                .count();

        System.out.println(count);
    }
}
