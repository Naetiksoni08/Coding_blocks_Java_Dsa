package assignment_questions;

import java.util.Scanner;

public class array_spiral_clockwise {

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
			int maxr = arr.length-1; // maximum row is the last element 
			int maxc= arr[0].length-1; // max column gives column index
			int total = arr.length * arr[0].length; // total number of elements are n*m
			int count = 0; //  we will maintain a count and then we will do count++ total number of elements will be printed
			while(count<total) { 
			for(int i = minr; i<=maxr && count<total;i++) {
				System.out.print(arr[i][minc] + ", "); // column is varying row is stop
				count++;
			}
			minc++;
			for(int i = minc; i<=maxc && count<total; i++) { // 4 loops for 4 boundary
				System.out.print(arr[maxr][i]+ ", "); // first row then column that is why i maxc
				count++;
			}
			maxr--;
			for(int i = maxr; i>=minr && count<total; i--) {
				System.out.print(arr[i][maxc] + ", ");
				count++;
			}
			maxc--;
			for(int i = maxc; i>=minc && count<total; i--) {
				System.out.print(arr[minr][i] + ", ");
				count++;
            }

			minr++;
		    }
			System.out.println("END");
			
	    }
	
}

