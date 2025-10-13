package blind_45_days_sheet;

import java.util.Scanner;

public class Number_of_Ways_cf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		numberofways(arr);

	}

	public static void numberofways(long[] arr) {
		long sum = 0;
		for(long x:arr) {
			sum+=x;
		}
		if (sum % 3 != 0) {
			System.out.println(0);
			return;
		}
		long part = sum / 3; // 1 part should have a sum of 3
		long twopart = 2 * part; // 2nd part should have a cut at 3*2 = 6
		long ways = 0;//Counts the total number of valid splits.
		long countways = 0;//till now, how many places could I make the first cut
		long prefix = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			prefix += arr[i];

			if (prefix == twopart)
				ways += countways;

			if (prefix == part)
				countways++;

		}
		System.out.println(ways);
	}

}
//When part = 0 and twopart = 0,
//So the second cut (twopart) counted the first cut (countways) that was just updated at the same index, which is invalid.
//By checking twopart first, you avoid counting a first cut at the same index
