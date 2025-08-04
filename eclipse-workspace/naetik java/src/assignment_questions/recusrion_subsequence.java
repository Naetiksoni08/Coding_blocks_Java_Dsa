package assignment_questions;

import java.util.Scanner;

public class recusrion_subsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		subseq(str, "");
		System.out.println();
		System.out.print(count);

	}

	static int count = 0;

	public static void subseq(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = str.charAt(0);
		subseq(str.substring(1), ans);
		subseq(str.substring(1), ans + ch);


	}
}
