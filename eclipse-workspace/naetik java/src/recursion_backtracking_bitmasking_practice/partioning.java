package recursion_backtracking_bitmasking_practice;

public class partioning {

	public static void main(String[] args) {
		String ques = "nitin";
		partioning(ques, "");

	}

	public static void partioning(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			partioning(ques.substring(i), ans + s + '|');
		}
	}

}
