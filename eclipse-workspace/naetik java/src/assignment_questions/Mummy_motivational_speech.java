package assignment_questions;


import java.util.Scanner;

public class Mummy_motivational_speech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] =sc.nextInt();
			}
			
		}
		 boolean istriangular= mummy(arr);
		   System.out.println(istriangular);

	}
	public static boolean mummy(int[][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[0].length; j++) {
				if(arr[i][j]!=0) {
					return false;
				}
			}

		}
		return true;
		
	}
	

}
