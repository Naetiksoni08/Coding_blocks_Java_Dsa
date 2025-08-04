package recursion_backtracking_bitmasking_practice;

public class subsequence {

	public static void main(String[] args) {
		String ques = "abcd";
//		subseq(ques,"");
		//System.out.println(count);
		System.out.println(countsubseq(ques, ""));

	}

	static int count = 0;

	public static int countsubseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			//count++;
			return 1;
		}
		char ch = ques.charAt(0);
		int a1 = countsubseq(ques.substring(1), ans);
		int a2 = countsubseq(ques.substring(1), ans + ch);
		
		return a1 + a2;
	}

	public static void subseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			// count++;
			return;
		}
		char ch = ques.charAt(0);
		subseq(ques.substring(1), ans);
		subseq(ques.substring(1), ans + ch);
	}

}

//we can count with the static variable but what if the interviewer asked us to count it using recursion so we will do this 
