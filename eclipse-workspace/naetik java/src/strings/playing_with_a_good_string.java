package strings;

import java.util.Scanner;

public class playing_with_a_good_string {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String s = Sc.next(); // 
		System.out.println(goodstring(s));

	}
	public static int goodstring(String s) {
		int count = 0;
		int ans= 0;
		for(int i = 0 ; i <s.length();i++) {
		char ch = s.charAt(i);//when i  = 0 then char is c and it stores(comes from s) into the char 
			if(isvowels(ch)) {
				count++;
			}
			else {
				ans = Math.max(ans,count);
				count=0;		

			}
			
		}
		ans = Math.max(ans, count);
		return ans; // this is used again at the end because
		//When we reach the end of the string, if the longest sequence of vowels ends on the last character, the count will be greater than the previous ans, but it hasn't been updated yet because there was no non-vowel character after it to trigger the ans = Math.max(ans, count) update.
	}
		public static boolean isvowels(char ch) {
			if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return true;
			
		}
			return false;
	}
		


}
 

