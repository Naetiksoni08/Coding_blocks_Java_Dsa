package two_d_array;

import java.util.Scanner;

public class user_input_2d_array {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int m = Sc.nextInt();
		int[][]arr=new int[n][m];
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j<arr[0].length; j++) {
				arr[i][j] = Sc.nextInt();
				
			}
		}
		Display(arr);
		

	}

	public static void Display(int[][] arr) {
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");
			
		
	     }
			System.out.println();

        }
	 }// this is the code for how to display a two d array 
}
