package assignment_questions;

import java.util.Scanner;

public class board_path_count_print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Count(N, M, "", 0);
		System.out.println();
		System.out.println(count);

	}
	
static int count= 0;

	public static void Count(int n, int m, String ans, int curr) {
		if (curr == n) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (curr > n) {
			return;
		}
		for (int dice = 1; dice <= m; dice++) {
			Count(n, m, ans + dice, curr + dice);
		}
		return;

	}
	// m tak jayega m is the no of faces of the dice agar m 6 hota toh 6 dalte

}
