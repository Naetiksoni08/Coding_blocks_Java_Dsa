package assignment_questions;

import java.util.Scanner;

public class array_spiral_anticlockwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m = sc.nextInt(); // row
		int n = sc.nextInt(); // column
		int [][]arr =new int[m][n];// mxn
	
		for(int i= 0 ; i <arr.length; i++) {
			for(int j = 0;j<arr[i].length; j++ ) {
				arr[i][j] = sc.nextInt();
				 
			}
		
		}
		print(arr,m,n);
	}
		
		public static void print(int[][]arr,int m ,int n) {
			int minr=0; // minimum row 
			int minc=0; // minimum column
			int maxr = arr.length-1;
			int maxc= arr[0].length-1; 
			int total = arr.length * arr[0].length; 
			int count = 0;
			while(count<total) {
				for(int i = minr; i<=maxr && count<total;i++) {
					System.out.print(arr[minc][i] + ", "); // row is varying column is stop
					count++;
				}
				minc++;
				for(int i = minc; i<=maxc && count<total; i++) { // 4 loops for 4 boundary
					System.out.print(arr[i][maxr]+ ", "); // first row then column that is why i maxc
					count++;
				}
				maxr--;
				for(int i = maxr; i>=maxr && count<total; i++) {
					System.out.println(arr[i][maxc]+", ");
					count++;
				}
				maxc--;
				for(int i = maxc ; i>=minc && count<total; i++) {
					System.out.println(arr[i][minr]+", ");
					count++;
				}
				minr++;
			}
			System.out.println("END");
			

	}

}
