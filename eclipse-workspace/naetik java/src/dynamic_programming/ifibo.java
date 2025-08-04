package dynamic_programming;

public class ifibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int [] dp = new int[n+1]; // array bana diya 
		System.out.println(fibotd(n,dp));

	}

	public static int fibotd(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n]; // ye apply kia hai humne dp 
//			kya n that is 5 par koi number hia 0 ke alawa kyuki by default value on the array will be 0 so if 0 ke alwa koi aur nuumber hai nai hai so this line wont work agar hai already that means already value sotred hai 
		}

		int f1 = fibotd(n - 1, dp);
		int f2 = fibotd(n - 2, dp);
		return dp[n] = f1 + f2; // yaad karlia

	}

}
