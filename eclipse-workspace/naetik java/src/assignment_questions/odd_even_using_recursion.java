package assignment_questions;

import java.util.Scanner;

public class odd_even_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		evenodd(N,1);

	}

	public static void evenodd(int N, int start) {
		if (N <= 0) {
			return;
		}
		if (N % 2 != 0) {
			System.out.println(N);

		}
		evenodd(N - 1, start);
		if (N % 2 == 0) {
			System.out.println(N);

		}

	}

}
