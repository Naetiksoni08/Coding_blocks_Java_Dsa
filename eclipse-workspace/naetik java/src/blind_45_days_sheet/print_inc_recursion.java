package blind_45_days_sheet;

public class print_inc_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printinc(n);
		

	}
	public static void printinc(int n) {
		if(n==0) {
			return;
		}
		printinc(n-1);
		System.out.println(n);
	}

}
