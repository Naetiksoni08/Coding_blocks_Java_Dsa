package blind_45_days_sheet;

public class zeroone_knapsack_problem {
	public static void main(String[] args) {
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int cap = 4;
		System.out.println(knapsack(wt, val, cap, 0));

	}

	public static int knapsack(int[] wt, int[] val, int cap, int idx) {
		if (cap == 0 || idx == wt.length) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + knapsack(wt, val, cap - wt[idx], idx + 1);
		}
		exc = knapsack(wt, val, cap, idx + 1);
		return Math.max(inc, exc);
	}

}
