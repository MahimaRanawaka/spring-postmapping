import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
        int[][] result = new int[matrix1.length][matrix2[0].length];


        if (matrix1[0].length != matrix2.length) {
            System.out.println("cannot do the multiplication");
            return;
        }


        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // print the result matrix in matrix form
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
