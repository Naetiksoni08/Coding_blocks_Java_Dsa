package assignment_questions;

import java.util.*;

public class print_lcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(lcs(s1, s2));

	}

	public static String lcs(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[s1.length() + 1][s2.length() + 1]; // cuz we are working for blank string too
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) { // cuz of - blank string
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

				}

			}
		}
		StringBuilder lcs = new StringBuilder();
		int i = m, j = n;
		while (i > 0 && j > 0) {// Loop chal raha hai tab tak jab tak hum strings ke start pe nahi pahunch jaate
								// (i=0 ya j=0). start kyuki hum dp table aage sai fill kar rahe hai aur
								// recursion piche sai chal raha hai
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) { // Agar current characters match karte hain, iska matlab ye
														// character LCS me belong karta hai.
				lcs.append(s1.charAt(i - 1));// Append it to lcs.
				i--; // dono ko reduce kardo
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1]) { // agar match nai hua toh joh bhi value badi hai uss taraf move
														// kardo
				i--;
			} else {
				j--;
			}
		}
		return lcs.reverse().toString(); // reverse order mia append hua hoga cuz hum recursion piche sai laga rahe the
											// isliye reverse and to string converts string builder into string

// Jab hum recursion ke end se trace karte hain, hum characters last se pehle wale sequence ke hisaab se append karte hain.
// Isliye StringBuilder.append() se jo sequence banta hai, wo ulta hota hai (last character pehle, first character baad me).
// thats why reverse;

	}

}
