package blind_45_days_sheet;

public class find_the_greatest_common_divisor_of_array {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 9, 10 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}
		int gcd = 1;
		for (int i = 1; i <= min; i++) {
			if (min % i == 0 && max % i == 0) {
				gcd = i;
			}

		}
		System.out.println(gcd);
	}

}

// now u might ask ki bhai why 1 sai min tk see

// min = 2  max = 10
// i = 1 sai 2 tk yani 1 and 2 
// 2%1 == 0 10%1 == 0 cool return gcd ans = 1
// i = 2 
// 2%2==0 10%2==0 so return 2 

// ab vaise toh yeh loop nai chalega but lets say chal bhi jaye 

// toh i = 3
// 2%3==2 and 10%3 == 1 thus yeh toh possible hi nai hai na bro so thats why min tk chalate hai 
