package blind_45_days_sheet;

public class palindromic_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		palindrome(s);
		

	}
	public static void palindrome(String s) {
		int n = s.length();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count+=expand(s,i,i); // odd length // left right 0,0 sai start hoga aur right mai 0,1
			count+=expand(s,i,i+1); // even length i+1 cuz even length mai center beech ke do character honge
		}
		System.out.println(count);
	}
	public static int expand(String s, int left, int right) {
		int count=0;
		while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)) { // first 2 condition checks if left and right our in bounds baki checks ki character eqaul hai ki nai
			count++;
			left--;
			right++;
		}
		return count;
	}

}
