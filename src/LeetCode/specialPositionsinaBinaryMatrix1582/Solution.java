package LeetCode.specialPositionsinaBinaryMatrix1582;

public class Solution {
    public static void main(String[] args) {
        int[][] num = {{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(num));
    }
    public static int numSpecial(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        int[] row = new int[R];
        int[] col = new int[C];

        for (int i=0; i < R; i++) {
            for (int j = 0; j < R; j++) {
                if (mat[i][j] ==1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int count = 0;
        for (int i =0; i < R; i++) {
            for (int j = 0; j<C; j++) {
                if (mat[i][j]==1 && row[i]==1 && col[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}
