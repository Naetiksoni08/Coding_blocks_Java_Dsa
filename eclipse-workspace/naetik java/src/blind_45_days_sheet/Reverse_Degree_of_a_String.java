package blind_45_days_sheet;

public class Reverse_Degree_of_a_String {

	public static void main(String[] args) {
		String s = "zaza";
		int i = 1;
		int product = 0;
		for (char c : s.toCharArray()) {
			int value = 'z' - c + 1; // a-z = 122-97 = 2 // 26
			product += value * i; // 26*1 = 26
			i++;
		}
		System.out.println(product);

	}

}
