package Competitive_programming;

import java.util.*;

public class Factor_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		List<Integer> ll = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				ll.add(i);
			}

		}
		Collections.sort(ll);
		
		if (p > ll.size()) {
			System.out.println(0);
			return;
		}

		System.out.println(ll.get((int) (p - 1)));
	}
}
