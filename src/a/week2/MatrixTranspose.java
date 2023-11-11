package a.week2;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        // Create the transpose matrix
        int[][] transposeMatrix = new int[numColumns][numRows];

        // Calculate the transpose of the matrix
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < numColumns; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
