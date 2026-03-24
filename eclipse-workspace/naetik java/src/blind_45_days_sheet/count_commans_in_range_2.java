package blind_45_days_sheet;

public class count_commans_in_range_2 {
	public static void main(String[] args) {
		int n = 1002;
		long bandstart = 1000;
		long bandend = 999999;
		long commas = 1;
		long count = 0;
		long totalcount = 0;
		
		while (bandstart <= n) {
			if (n <= bandend) { // n is band mein hai (PARTIAL) yani n bandend ke andar partially aah raha hai 
				count = n - bandstart + 1;
			}
			if (n > bandend) { // n is band se aage hai (FULL)
				count = bandend - bandstart + 1; // yani n joh hai voh bandend ke andar pura aah raha hai 
			}

			totalcount += count * commas;

			bandstart = bandstart * 1000;
			bandend = bandend * 1000 + 999;
			commas++;
		}
		System.out.println(totalcount);

	}

}