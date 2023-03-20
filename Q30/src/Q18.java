import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] result = new int[3][3];

        // iterate through each element in both matrices and add them
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // print the result matrix in matrix form
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
