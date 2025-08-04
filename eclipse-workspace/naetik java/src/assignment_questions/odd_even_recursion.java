package assignment_questions;

import java.util.Scanner;

public class odd_even_recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		odd(N,0);

	}

	public static void odd(int N,int ans) {
		if(N<=0) {
			System.out.println(ans);
			return;
		}
		odd(N-2,ans);
	}

}
