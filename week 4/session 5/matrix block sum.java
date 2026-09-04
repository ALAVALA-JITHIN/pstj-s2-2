import java.util.*;

public class Main {

    public static int[][] matrixBlockSum(int[][] mat, int k) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                int sum = 0;

                // Find the boundaries of the block
                int startRow = Math.max(0, i - k);
                int endRow = Math.min(rows - 1, i + k);

                int startCol = Math.max(0, j - k);
                int endCol = Math.min(cols - 1, j + k);

                // Add all elements inside the block
                for (int r = startRow; r <= endRow; r++) {
                    for (int c = startCol; c <= endCol; c++) {
                        sum += mat[r][c];
                    }
                }

                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int k = 1;

        int[][] result = matrixBlockSum(mat, k);

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}

//output
1 2 3
4 5 6
7 8 9

k = 1

[12, 21, 16]
[27, 45, 33]
[24, 39, 28]
