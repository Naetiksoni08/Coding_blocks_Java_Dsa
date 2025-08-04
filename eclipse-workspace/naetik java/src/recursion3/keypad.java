package recursion3;

public class keypad {
	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		print(ques,"");
	}
	public static void print(String ques , String ans) {
		if(ques.length() == 0 ) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		int num = ch-'0';
		String press = map[num];
		for(int i = 0 ; i<press.length(); i++) {
			
			print(ques.substring(1),ans+press.charAt(i));
			}
		}

}
