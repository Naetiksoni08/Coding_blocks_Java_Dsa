package assignment_questions;

import java.util.Scanner;

public class wave_print_column_wise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // columns
        int[][] arr = new int[m][n]; // m x n matrix

        // Input the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Call wave_print
       wave_print(arr);
	}
	public static void wave_print(int[][]arr) {
	for(int col = 0; col<arr[0].length; col++) {
		if(col%2==0) {//if even 
			for(int row = 0; row<arr.length;row++) { 
			//then row starts from 0
				System.out.print(arr[row][col]+", "); // does not matter if the loop is first of row or column 
				
				
			}
		}
		else {
			for(int row = arr.length-1; row>=0 ;row--) {
				System.out.print(arr[row][col]+", "); 
				
			}
		}
	}
	System.out.println("END");
}

}
