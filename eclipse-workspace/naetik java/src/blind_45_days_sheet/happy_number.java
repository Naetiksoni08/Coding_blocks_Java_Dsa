package blind_45_days_sheet;

import java.util.*;

public class happy_number {
	public static void main(String[] args) {
		int n = 19;
		HashSet<Integer> seen = new HashSet<>();
		while (n != 1) {
			if (seen.contains(n))
				System.out.println(false); // cycle detection like no vapas repeat ho raha hai it will never end
			seen.add(n);
			int sum = 0;
			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n /= 10;
			}
			n = sum;
		}
		System.out.println(true);

	}
}