package assignment_questions;


import java.util.*;

public class Hour_glass_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = N; i >= 0; i--) { // outer loop
			for (int spaces = 0; spaces < N - i; spaces++) { // if this is not present then the actuall shape of the hour glass wont get printed
              System.out.print("  "); // for the i = 5  that is the first row we dont need any spaces so 5-5 = 0 then 
			}
			
			//left side number
			for (int j = i; j > 0; j--) {
				System.out.print(j+" ");
			}
			
			System.out.print("0 ");
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();

		}
		
		for (int i = 1; i<=N ; i++) { // this loop is for rows
			for (int spaces = 0; spaces < N - i; spaces++) {
              System.out.print("  ");
			}
			
//			left side number
			for (int j = i; j > 0; j--) {
				System.out.print(j+" ");
			}
			
			System.out.print("0 ");
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();

		}
		
		


	}
}