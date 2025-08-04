package recursion_backtracking_bitmasking_practice;

public class print_subsequence_using_bitmasking {

	public static void main(String[] args) {
		String ques = "abc";
		print(ques);
		

	}

	public static void print(String ques) {
		int n = ques.length();
		for (int i = 0; i < (1 << n); i++) {
			print1(ques, i);
		}
	}

	public static void print1(String ques, int i) {
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(ques.charAt(pos));

			}
			pos++;
			i = i >> 1;
		}
		System.out.println();

	}

}
