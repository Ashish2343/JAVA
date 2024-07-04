package Exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix={{1,3,4},{3,4,5},{1,0,3}
        };

        System.out.println(Arrays.deepToString(zeromatrix(matrix)));

    }
    static int[][] zeromatrix(int[][] matrix){
        int[][]a;
        a=matrix;
        int m= matrix.length;
        int n =matrix[0].length;
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

}
