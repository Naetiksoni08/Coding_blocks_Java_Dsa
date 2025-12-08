package blind_45_days_sheet;

public class largest_prime_from_consecutive_prime_sum_contest_479 {
	
	class Solution {
	    public int largestPrime(int n) {
	        int sum = 0;
	        int ans = 0;
	        int num = 2;
	        while (sum <= n) {
	            if (isPrime(n)) {
	                sum += num;

	                if (sum > n)
	                    break;

	                if (isPrime(sum)) {
	                    ans = sum;
	                }
	            }
	            num++;
	        }
	        return ans;

	    }

	    private boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

}
