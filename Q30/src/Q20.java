public class Q20 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0 }
        };

        // print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // create an 'L' shape
        matrix[1][4] = 1;
        matrix[2][4] = 1;
        matrix[3][4] = 1;
        matrix[4][4] = 1;
        matrix[4][3] = 1;

        // print the modified matrix
        System.out.println("Modified Matrix:");
        printMatrix(matrix);

        // rotate the matrix by 90 degrees using a rotation matrix
        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        // print the rotated matrix
        System.out.println("Rotated Matrix:");
        printMatrix(rotatedMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
