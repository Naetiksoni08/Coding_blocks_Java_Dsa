package blind_45_days_sheet;

public class fact_tail_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(tail(n,1));
		

	}
	public static int tail(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return tail(n-1, ans*n);
	}

}
