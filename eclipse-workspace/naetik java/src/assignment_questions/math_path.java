package assignment_questions;

import java.util.Scanner;

public class math_path {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt(); // rows
		int N2 = sc.nextInt(); // col
		mathpath(0, 0, N1 - 1, N2 - 1, "");
		System.out.println();
		System.out.println(count);
		

	}

	// cc- current col
	// current row
	// end column
	// end row
	static int count = 0;
	public static void mathpath(int cc, int cr, int ec, int er, String ans) {
		if (cc == ec && cr == er) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}
		mathpath(cc + 1, cr, ec, er, ans + "V");
		mathpath(cc, cr + 1, ec, er, ans + "H");
		mathpath(cc + 1, cr + 1, ec, er, ans + "D");

	}

}
