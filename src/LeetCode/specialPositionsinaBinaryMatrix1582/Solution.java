package LeetCode.specialPositionsinaBinaryMatrix1582;

public class Solution {
    public static void main(String[] args) {
        int[][] num = {{0, 0}, {0, 0}, {1, 0}};
        System.out.println(numSpecial(num));
    }

    public static int numSpecial(int[][] mat) {
        int count = 0;
        int R = mat.length;
        int C = mat[0].length;
        int[] row = new int[R];
        int[] col = new int[C];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    row[i]++;
                }
            }
        }
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] == 0) {
                    col[i]++;
                }
            }
        }
        for (int k = 0; k < mat.length; k++) {
            for (int w = 0; w < mat[0].length; w++){
                if (mat[k][w] ==1) {
                    if (row[k]==C-1 && col[w] == R-1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
