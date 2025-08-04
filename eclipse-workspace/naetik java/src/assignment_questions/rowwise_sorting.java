package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class rowwise_sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][]arr = new int[r][c];
		for(int i=0; i<r;i++) {
			for(int j = 0 ; j<c; j++) {
				arr[i][j] = sc.nextInt();
		    	}
				
			}
		for(int i = 0 ; i < r; i++) {
			Arrays.sort(arr[i]);
			}
		for(int i=0; i<r;i++) {
			for(int j = 0 ; j<c; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}

		}
	}

