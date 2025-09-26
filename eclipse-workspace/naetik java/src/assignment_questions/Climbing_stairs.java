package assignment_questions;

import java.util.*;

public class Climbing_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		int result = stairs(n, dp);
		System.out.println(result);

	}

	public static int stairs(int n, int[] dp) {
		if (n == 0) {
			return 1;
		} // why 1 cuz if n==0 then we reached our destination so that is our 1 way right maine 1+1 step liye  = 2 so yeh ek single way hua toh n destination so thats why 1
		if (n < 0) {
			return 0; // 
		}
		if (dp[n] != -1) {
			return dp[n];
		}

		int step1 = stairs(n - 1, dp);
		int step2 = stairs(n - 2, dp);
		return dp[n] = step1 + step2;

	}//leetcode question 70 

}// this question is just like fibonacci see the question is that we can only
	// take 2 step either 1 or 2 at a time nd in fibo nacci bhi n-1+n-2 krte the and move lene sai phele hume paata hona chhaiye ki humare n-1 wala move kya tha
//explainso basically the quesiton is we are given with destination whcih is 2 in our case and we need to find ithat ki hum uss destination pr kitne ways mai poch sakte hai nd we can ony take 1 step or 2 step at a time that it
