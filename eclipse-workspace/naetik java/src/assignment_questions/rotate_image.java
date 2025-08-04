package assignment_questions;

import java.util.Scanner;

public class rotate_image {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions (square matrix)
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Rotate the matrix 90° anticlockwise
        rotateAnticlockwise(matrix);

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void rotateAnticlockwise(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse the rows
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                // Swap elements in the ith row with elements in the (n-1-i)th row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
    }
}
