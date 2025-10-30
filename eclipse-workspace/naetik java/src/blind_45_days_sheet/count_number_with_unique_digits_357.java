package blind_45_days_sheet;

public class count_number_with_unique_digits_357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(countnumber(n));

	}

// mathematics approach
	public static int countnumber(int n) {
		if (n == 0) {
			return 1;
		}
		int count = 10; // Start mein hum count = 10 rakhte hain because for n = 1 0 sai 9 tk 10 number
						// will be unique
		int unique = 9; // Current digit-length kai kitnai unique numbers banenge jaise n = 2 ke liye 81
		int available = 9; // Ye track karta hai ki abhi kitne number bache hain joh unique hai unused hai
							// basically
		for (int i = 2; i <= n; i++) {
			unique *= available;
			count += unique;
			available--;
		}
		return count;
	}
}