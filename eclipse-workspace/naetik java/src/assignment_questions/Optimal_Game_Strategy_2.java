package assignment_questions;

import java.util.*;

public class Optimal_Game_Strategy_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of coin
		int[] valueofcoin = new int[n];
		for (int i = 0; i < valueofcoin.length; i++) {
			valueofcoin[i] = sc.nextInt();
		}
		int[][] dp = new int[n][n];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		System.out.println(optimalgame(valueofcoin, 0, valueofcoin.length - 1, dp));

	}

	public static int optimalgame(int[] value, int i, int j, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int firstcoin = value[i] + Math.min(optimalgame(value, i + 2, j, dp), optimalgame(value, i + 1, j - 1, dp));
		int lastcoin = value[j] + Math.min(optimalgame(value, i + 1, j - 1, dp), optimalgame(value, i, j - 2, dp));
		return dp[i][j] = Math.max(firstcoin, lastcoin); // cuz maximum return karna tha so which ever gives more value
															// we want that
	}

}

//int firstcoin = value[i] + Math.min(optimalgame(value, i + 2, j), optimalgame(value, i + 1, j - 1)); int lastcoin = value[j] + Math.min(optimalgame(value, i + 1, j - 1), optimalgame(value, i, j - 2)); 
//basically say piyush nai i wala uthaya toh nimit ya toh i+1 wala coin lega agar leta hai tohpiyush ke liye range 
//bachi i+2 sai j tk varna minit last coin lega toh piyush ke liye range bachi i+1 sai j-1 tk why i+1 cuz piyush nai
//already value of i yani phela coin pick kar lia hai then 2nd call agar piyush hi last wala pick karta hai coin toh 
//ya toh again nimit 1st coin lega agar leta hai toh piyush ke liye range hui i+1 sai j-1 why j-1 cuz piyush already last
//coin le chuka hai then ya fir nimit last coin lega j wala piyush leh. chuka hai toh nimit j-1 wala lega toh piyush ki 
//range bachi i sai j-2

// why minimum of the calls 
//Nimit hamesha Piyush ka gain minimize karna chahega.
//Matlab, jo bhi choice Nimit lega, wo Piyush ke liye worst case create karega cuz nimit is also playing optimally right
//Isliye minimum of the two recursive calls → kyunki Piyush ke liye Nimit ka optimal move = worst-case for Piyush
//Agar hum max le lete → matlab hum assume kar rahe ki Nimit hamesha Piyush ka fayda badhane wala choose karega → jo galat assumption hai, kyunki Nimit bhi smart hai.
