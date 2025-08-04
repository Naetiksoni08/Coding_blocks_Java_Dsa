package two_d_array;

import java.util.Scanner;

public class NOBITA_CANDIES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {

			long candy = sc.nextLong();
			long frnds = sc.nextLong();

			long reminder = candy % frnds; // number of candies nobita has after distributing and he has to take in
											// return

			long result = Math.min(reminder, frnds - reminder);

			System.out.println(result);
			t--;

		}

	}

}
