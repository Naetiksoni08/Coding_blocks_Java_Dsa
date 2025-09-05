package assignment_questions;

import java.util.Scanner;

public class replaces_0_with_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = replace(N);
		System.out.println(ans);
		

	}

	public static int replace(int N) {
		if(N==0) {
			return 0;
		}
		
		
		int digit = N %10;
		if(digit == 0) {
			digit = 5;
			
		}
		return replace(N/10)*10+digit;
		

	}

}
