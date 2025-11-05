package Competitive_programming;

import java.util.*;

public class Factor_Game_optimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		List<Long> ll = new ArrayList<>();
		for (long i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				ll.add(i);
				if (i != n / i) { //— this check avoids adding duplicates.
					ll.add(n / i); // if theyboth are not same i and n/i facor then add the n/i factor too
				}

			}
			

		}
//		System.out.println(ll); all the valid factors we got by just lloping till root n
		Collections.sort(ll);
		
		if (p > ll.size()) { //if p > size of the no of factors which are stored in the list 
			System.out.println(0);
			return;
		}

		System.out.println(ll.get((int) (p - 1))); // becuase zero based hoti hai list 
	}

}

//For any number n, if i divides n, then (n / i) is also a factor.
