package assignment_questions;

import java.util.Scanner;

public class How_many_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result=0;
		while (t > 0) {
			int[] arr = new int[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			boolean check = questions(arr);
			if(check) {
				result++;
			}
			t--;
		
			
		}
		System.out.println(result);
	


	}

	public static boolean questions(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				sum++;
			}

		}
		return sum >= 2;

	}

}
