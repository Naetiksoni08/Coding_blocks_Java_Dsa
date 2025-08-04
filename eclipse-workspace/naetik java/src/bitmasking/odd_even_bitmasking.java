package bitmasking;

import java.util.Scanner;

public class odd_even_bitmasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ((n & 1) == 0) {
			System.out.println("even no");
		} else {
			System.out.println("odd no"); 
		}

	}

}
