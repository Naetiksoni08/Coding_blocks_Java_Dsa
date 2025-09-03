package assignment_questions;

import java.util.Scanner;

public class Nobita_scored_good_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T=  sc.nextInt();
		while(T>0) {
			int x = sc.nextInt();
			int n = sc.nextInt();
			T--;
			System.out.println(nobita(x, n));
		}

		


	}
	public static int nobita(int candies,int friends) {
		int reminder = candies%friends; // 14%4 = 2
		int remainingcandies = friends-reminder;
		return Math.min(reminder, remainingcandies);
		
	}

}
