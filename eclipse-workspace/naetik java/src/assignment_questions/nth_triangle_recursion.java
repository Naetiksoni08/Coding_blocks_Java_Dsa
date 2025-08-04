package assignment_questions;

import java.util.Scanner;

public class nth_triangle_recursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(triangle(N));

	}
	public static int triangle(int N) {
		if(N==1) {
			return 1;
		}
		return N+triangle(N-1);
		
		
	}

}
