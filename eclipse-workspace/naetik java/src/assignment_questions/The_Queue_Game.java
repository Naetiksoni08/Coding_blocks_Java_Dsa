package assignment_questions;

import java.util.*;

public class The_Queue_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			t--;
			boolean result = operation(arr);
			if(result) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}

	}

	public static boolean operation(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				count--;

				if (count < 0) { // there was nothing to pop kahi aisa na ho jaye pop karte karte koi element hi na bache pop karne ke liye
					return false;
				}

			}
			

		}
		return true;
	}
}
