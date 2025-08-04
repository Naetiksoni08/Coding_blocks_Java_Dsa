package assignment_questions;

import java.util.Scanner;

public class recursion_lexicographyical_rder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.print('0'+" ");
		for (int i = 1; i <= 9; i++) {
			counting(N, i);
			
		}

	}

	public static void counting(int n, int curr) {
		if (curr > n) {
			return;
		}
		
		System.out.print(curr+" ");

		for (int i = 0; i <= 9; i++) {
			counting(n, curr * 10 + i);

		}

	}

}
