package assignment_questions;


import java.util.Scanner;

public class A_boolean_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // row 
		int m =sc.nextInt(); // col
		int [][] arr = new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <m; j++) {
				arr[i][j] = sc.nextInt();
			} 
		}
		matrix(arr, n, m);

	}
	
	public static void  matrix(int[][]arr,int n,int m) {
		n = arr.length; // row
		m = arr[0].length; // col
		int [] row = new int[n];
		int [] col = new int[m];
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j]==1) { // 0,0 --> 1
					row[i] = 1;
					col[j] = 1;
				}
				
				
			}
		}
	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(row[i]==1 || col[j]==1) {
					arr[i][j] = 1;
				}
			}
		}	
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
			
			
			
			
		}
	}
	
