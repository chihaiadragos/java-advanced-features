package LeetCode.findtheTownJudge997;

class Solution {
    public static void main(String[] args) {
        System.out.println(findJudge(2,new int[][]{{1,2}}));
        System.out.println(findJudge(3,new int[][]{{1,3},{2,3}}));
        System.out.println(findJudge(3,new int[][]{{1,3},{2,3},{3,1}}));
    }
    public static int findJudge(int N, int[][] trust) {
        int[] in = new int[N + 1];
        int[] out = new int[N + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (in[i] == N - 1 && out[i] == 0)
                return i;
        }
        return -1;
    }
}
