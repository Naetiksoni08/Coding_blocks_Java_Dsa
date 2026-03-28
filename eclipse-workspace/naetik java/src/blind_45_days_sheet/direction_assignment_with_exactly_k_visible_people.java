package blind_45_days_sheet;

public class direction_assignment_with_exactly_k_visible_people {
	class Solution {
	    long MOD = 1_000_000_007;
	    long[] fact;
	    
	    public int numberOfWays(int n, int pos, int k) {
	        fact = new long[n+1];
	        fact[0] = 1;
	        for(int i = 1; i <= n; i++)
	            fact[i] = fact[i-1] * i % MOD;
	        
	        int left = pos;
	        int right = n-1-pos;
	        
	        long ans = 0;
	        for(int j = 0; j <= k; j++) {
	            if(j <= left && k-j <= right) {
	                ans = (ans + comb(left, j) * comb(right, k-j) % MOD * 2) % MOD;
	            }
	        }
	        return (int)ans;
	    }
	    
	    long comb(int n, int r) {
	        if(r < 0 || r > n) return 0;
	        return fact[n] * power(fact[r], MOD-2) % MOD 
	               * power(fact[n-r], MOD-2) % MOD;
	    }
	    
	    long power(long base, long exp) {
	        long result = 1;
	        base %= MOD;
	        while(exp > 0) {
	            if(exp % 2 == 1) result = result * base % MOD;
	            base = base * base % MOD;
	            exp /= 2;
	        }
	        return result;
	    }
	}

}
