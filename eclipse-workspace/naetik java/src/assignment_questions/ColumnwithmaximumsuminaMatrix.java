package assignment_questions;

import java.util.Scanner;

public class ColumnwithmaximumsuminaMatrix {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt(); // integer
				int[][] arr = new int[n][n];
				
				// Read the matrix input
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						arr[i][j] = sc.nextInt();
					}
				}

				// Initialize variables to track the max sum and column index
				int maxSum = Integer.MIN_VALUE;
				int maxColumnIndex = -1;

				// Traverse each column to find the one with the maximum sum
				for (int j = 0; j < n; j++) {
					int sum = 0;
					for (int i = 0; i < n; i++) {
						sum += arr[i][j];
					}

					// Update if this column has the maximum sum
					if (sum > maxSum) {
						maxSum = sum;
						maxColumnIndex = j; // Store 0-based column index
					}
				}

				// Output the 1-based column index and the maximum sum
				System.out.print((maxColumnIndex + 1+" ")); // 1-based index
				System.out.print(maxSum);               // Maximum sum
			}
		}
