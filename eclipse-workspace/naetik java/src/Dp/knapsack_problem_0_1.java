package Dp;

public class knapsack_problem_0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] wt= {1,2,3,2,2};
		int [] value = {8,4,0,5,3};
		int capacity = 4;
		System.out.println(sack(wt, value, capacity, 0));

		
	}
	public static int sack(int[]wt,int[] value,int cap,int idx) {
		if(cap==0||idx==wt.length) {
			return 0;
		}
		int inc = 0,exc=0;
		
		if(cap >= wt[idx]) {
			inc = value[idx]+sack(wt, value, cap-wt[idx], idx+1);
			
		}
		exc = sack(wt, value, cap, idx+1);
		return Math.max(inc, exc);
		
	}
	

}
