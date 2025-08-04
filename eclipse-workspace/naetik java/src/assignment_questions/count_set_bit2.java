package assignment_questions;

import java.util.Scanner;

public class count_set_bit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		for(int i = 0 ; i<N1; i++) {
			int N2 = sc.nextInt();
			System.out.println(fastcount(N2));
			
		}
		

	}

	public static int fastcount(int n ) {
		int count = 0 ; 
		while(n>0) {
			n = (n&(n-1));
			count++;
		}
		return count;
		
	}
	
}



