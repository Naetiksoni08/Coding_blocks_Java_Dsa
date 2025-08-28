package dynamic_programming;

import java.util.Arrays;

public class edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		int [][]dp = new int[s.length()+1][t.length()+1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(edit_distancetopup(s,t,0,0,dp));
		
	}
	public static int edit_distancetopup(String s,String t,int i,int j,int [][]dp) {
		if(j==t.length()) {
			return s.length()-i;
		}
		if(i==s.length()) {
			return t.length()-j;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if(s.charAt(i)==t.charAt(j)) {
			ans = edit_distancetopup(s,t,i+1,j+1,dp);
		}
		else {
			int D = edit_distancetopup(s,t,i+1,j,dp);
			int I = edit_distancetopup(s,t,i,j+1,dp);
			int R = edit_distancetopup(s,t,i+1,j+1,dp);
			ans = Math.min(I,Math.min(D, R))+1;
		}
		return dp[i][j] = ans;
		
	}

}
