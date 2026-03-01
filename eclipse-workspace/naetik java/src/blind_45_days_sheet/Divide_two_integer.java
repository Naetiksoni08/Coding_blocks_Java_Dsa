package blind_45_days_sheet;

public class Divide_two_integer {

	public static void main(String[] args) {
		int dividend = 10;
		int divisor = 3;
		int result = 0;
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			System.out.println(Integer.MAX_VALUE);
		}
		boolean negative = (dividend < 0) ^ (divisor < 0);

		long dvd = Math.abs((long) dividend);
		long dvs = Math.abs((long) divisor);

		while (dvd >= dvs) {
			long tempDivisor = dvs;
			int count = 1;
			while (tempDivisor * 2 <= dvd) {
				tempDivisor = tempDivisor << 1;
				count = count << 1;
			}
			dvd -= tempDivisor;
			result += count;
		}
		System.out.println(negative ? -result : result);

	}
	// O(log n * log n) = O(log² n)
}

