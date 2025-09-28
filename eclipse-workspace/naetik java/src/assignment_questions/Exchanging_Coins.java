package assignment_questions;

import java.util.*;

public class Exchanging_Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		HashMap<Long, Long> dp = new HashMap<>();
		long result = exchanging(n, dp);
		System.out.println(result);

	}

	public static long exchanging(long n, HashMap<Long, Long> dp) {
		if (n == 0) {
			return 0;
		}
		if(dp.containsKey(n)) {
			return dp.get(n); // basically dp[n] !=-1 return dp[n];
		}

		long n1 = exchanging(n / 2, dp);
		long n2 = exchanging(n / 3, dp);
		long n3 = exchanging(n / 4, dp);
		long result = Math.max(n, n1 + n2 + n3);
		dp.put(n, result); // this is similar to dp[n] i means we use to do dp[n] = Math.max(n, n1+n2+n3);
							// we just stored the max thing in a vairbale and then we did dp.put n-->par
							// result so bas same hai dp[n] = Math.max(n, n1+n2+n3);
		return result;
	}
	 private static int Exchange(int number) {
	        if (number == 0) {
	            return 0;
	        }
	        int n1 = Exchange(number / 2);
	        int n2 = Exchange(number / 3);
	        int n3 = Exchange(number / 4);
	        return Math.max(number, n1 + n2 + n3);
	    }
	}

