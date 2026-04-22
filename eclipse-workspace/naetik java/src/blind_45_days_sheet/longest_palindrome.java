package blind_45_days_sheet;

public class longest_palindrome {

	public static void main(String[] args) { // we had use the string and using the string we have to make the longest palindrome from those characters
		String s = "abccccdd";
		int[] freq = new int[128];
		for (char a : s.toCharArray()) {
			freq[a]++;
		}
		int ans = 0;
		boolean hasodd = false;
		for (int f : freq) {
			ans += (f / 2) * 2;
			if (f % 2 == 1) 
				hasodd = true;
		}
		System.out.println(hasodd ? ans + 1 : ans);
	}

}
//f=4: 4/2=2 pairs → 2*2=4 chars 
//f=5: 5/2=2 pairs → 2*2=4 chars  (1 drop!)
//f=1: 1/2=0 pairs → 0*2=0 chars  (1 drop → middle!)
//
//freq = new int[52]
//index: 0,1,2...51
//
//'A' ka ASCII = 65 → freq[65] → index 65 exist nahi!
//'a' ka ASCII = 97 → freq[97] → index 97 exist nahi!
//Array sirf 0-51 tak hai — but hum 65 aur 97 pe access karna chahte hain!

//freq = new int[128]
//index: 0,1,2...127
//
//'A' = 65 → freq[65] exist karta hai!
//'Z' = 90 → freq[90] exist karta hai!
//'a' = 97 → freq[97] exist karta hai!
//'z' = 122 → freq[122] exist karta hai!
