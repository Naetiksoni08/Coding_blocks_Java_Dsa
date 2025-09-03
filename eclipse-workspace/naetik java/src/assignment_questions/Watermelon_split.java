package assignment_questions;

import java.util.Scanner;

public class Watermelon_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		if (w % 2 == 0 && w > 2) { // or W!=2
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
