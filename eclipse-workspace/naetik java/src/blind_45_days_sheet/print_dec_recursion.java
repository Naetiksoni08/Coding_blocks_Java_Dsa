package blind_45_days_sheet;

public class print_dec_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(printdec(n));

	}

	public static int printdec(int n) {
		if(n==1) {
			return 1;
		}
		
		System.out.println(n);
		return printdec(n-1);

	}

}
