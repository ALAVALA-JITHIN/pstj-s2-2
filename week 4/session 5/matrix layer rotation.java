import java.util.*;

public class Main {

    public static void rotateLayer(int[][] matrix, int r) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            // Store one layer's elements
            ArrayList<Integer> list = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = rows - 1 - layer;
            int right = cols - 1 - layer;

            // Top row
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                list.add(matrix[bottom][j]);
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                list.add(matrix[i][left]);
            }

            // Number of rotations
            int size = list.size();
            r = r % size;

            // Put rotated values back
            int index = r;

            // Top row
            for (int j = left; j <= right; j++) {
                matrix[top][j] = list.get(index);
                index = (index + 1) % size;
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = list.get(index);
                index = (index + 1) % size;
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                matrix[bottom][j] = list.get(index);
                index = (index + 1) % size;
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                matrix[i][left] = list.get(index);
                index = (index + 1) % size;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int r = 1;

        rotateLayer(matrix, r);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//output

1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

r = 1

2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
