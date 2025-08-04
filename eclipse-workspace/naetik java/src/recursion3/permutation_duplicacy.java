package recursion3;

public class permutation_duplicacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		String ans = "";
		System.out.println(count(ques,""));
	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			Boolean val = true;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					val = false;
					break;
				}
			}
			if (val == true) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				print(s1 + s2, ans + ch);
			}
	
		}
	}
		public static int count(String ques, String ans) {
			if (ques.length() == 0) {
				System.out.println(ans);
				return 1;
			}
			int count1 = 0;
			for (int i = 0; i < ques.length(); i++) {
				char ch = ques.charAt(i);
				
				Boolean val = true;
				for (int j = i + 1; j < ques.length(); j++) {
					if (ques.charAt(j) == ch) {
						val = false;
						break;
					}
				}
				if (val == true) {
					String s1 = ques.substring(0, i);
					String s2 = ques.substring(i + 1);
					count1 +=count(s1+s2 ,ans+ch);
				}
			
			}
			return count1;
		
		}

}
