package blind_45_days_sheet;

public class factorial_trailing_zeroes {

	public static void main(String[] args) {
		int n = 25;
		int count = 0;
		while (n > 0) {
			n = n / 5; // 10 ki vaje sai 0 ata hai aur 10mbanta hai 2*5 sai but 2 toh har doosra no
						// even hota hai so 5 har 5th place par ata hai so thats why 5
			count += n;
		}
		System.out.println(count);
	}

}
