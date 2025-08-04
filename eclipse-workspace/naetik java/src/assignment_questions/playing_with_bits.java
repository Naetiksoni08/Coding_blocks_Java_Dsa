package assignment_questions;

import java.util.Scanner;

public class playing_with_bits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		while(Q>0) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int totalcount = 0;
		for(int i = a ; i <=b; i++) {
			totalcount +=count(i);
			
		}
		
		System.out.println(totalcount);
		Q--;
	}
	}

	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

}
