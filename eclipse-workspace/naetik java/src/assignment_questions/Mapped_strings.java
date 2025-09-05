package assignment_questions;

import java.util.*;

public class Mapped_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number = sc.next(); // int ki jagah string kam code likhna padega hume
		char[] arr = number.toCharArray(); // convert that into char array
		Arrays.sort(arr);
		String result = "";
		for (char c : arr) {
			result += c;
		}
		List<List<String>> finallist = new ArrayList<>(); // storing all the possibilities in this of 123 
		List<String> ll = new ArrayList<>(); // temporary list
		answer(result, ll, finallist); 
		for (List<String> s : finallist) { // ek ek karke possibility la rahe hai 
			String ans = ""; // ans bana lia hai empty string
			for (String s1 : s) {  //say "1","2","3" yeh tha possibility 1 aaya 
				ans += (char) (Long.parseLong(s1) + 64); // 1+64 = 65 bangaya usse character mai convert kardia so a ban gaya then 2 aaya +64 = b ban gaya then c 3+64 = 67 so c ban gaya end mai answer print kardia
				//Har ek string number ko number banata hai → character banata hai.
			}
			System.out.println(ans);
		}

	}

	private static void answer(String number, List<String> ll, List<List<String>> finallist) {
		if (number.isEmpty()) {
			finallist.add(new ArrayList<>(ll)); // copy kardia all possibility ko ll which is temporary list to the main finallist
			return;
		}
		for (int i = 1; i <= number.length(); i++) {
			String result = number.substring(0, i);
			if (64 + Long.parseLong(result) >= 65 && 64 + Long.parseLong(result) <= 90) { // checks if joh substring ka number hai voh sai 26 ke beech mai hai ya nai
				ll.add(result);
				answer(number.substring(i), ll, finallist); // recursive call baki string ke liye output leke aah 
				ll.remove(ll.size() - 1);
			}
//parselong string ko number mai badal dega
			//say result was "12"
			//64+1 = 65 and 64+26 = 90 so 65,90 is A,Z mtlb ki lower bound 1 par set hogaya hia aur upper bound 26 pr
			// it is like this  if(num>=1 && num<=26)
			//example if result mai "1"-->64+1 = 65
			// if result mai "23" tha toh 64+23 = 87 <= 90
			// but if reuslt mai "27" hota toh 64+27 = 91 wrong 
		}
	}

}
