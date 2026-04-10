package blind_45_days_sheet;

public class number_of_1_bit {
	public static void main(String[] args) {
		int n = 11;
		int count = 0;
		while(n!=0) {
			n = n&(n-1);
			count++;
		}
		System.out.println(count);
	}

}
