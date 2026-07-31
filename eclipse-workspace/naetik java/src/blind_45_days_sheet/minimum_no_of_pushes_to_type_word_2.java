package blind_45_days_sheet;

import java.util.Arrays;
import java.util.Collections;

public class minimum_no_of_pushes_to_type_word_2 {

	public static void main(String[] args) {
		String word = "abcde";
		int[] freq = new int[26];
		for (char c : word.toCharArray()) {
			freq[c - 'a']++;
		}
		// now once each char frequency is calculated next we have to sort the freq in
		// descending order right
		// so the prob is that we cannot direct reverse primitive array type so we need
		// to make a non primitive array of integer then copy the freq into that array
		// and then we will do reverse
		Integer[] frequency = new Integer[26];
		for (int i = 0; i < 26; i++) {
			frequency[i] = freq[i];
		}
		Arrays.sort(frequency, Collections.reverseOrder()); // done reverse done

		int ans = 0;
		for (int i = 0; i < 26; i++) {
			if (frequency[i] == 0)
				break; // koi letter hi nai bacha
			int pushes = (i / 8) + 1;
			ans += frequency[i] * pushes;
		}
		System.out.println(ans);

	}

}
//So basically we have already done the first part of this question, which was an easy part, and I will tell you the key difference between these two questions.
//In part 1 it was said that each letter can only and only appear at once. That means there will be no duplicate in the word, right? string word.
//Secondly we were said that we just need to count. Our approach was that we will simply count the number of letters in the string and then we will distribute those letters or those characters in the eight keys

//Now the second part basically says that in the string word now there can be the letters that can repeat so they are no longer distinct elements, right? No longer distinct elements. Now the key insight is that the frequency of each character now matters a lot. I'll tell you how 

//Our approach was simple and it was a frequency-based greedy approach. Basically what we say is that our main idea was that the letter who appears the most We will place that litter at the least push  mtlb letter joh sabsai zada baar ataa hai usse sab se kam push par rakho

//So suppose 
//Example: "aabbccddeeffgghhiiiiii"

//Frequency:
//i = 6 (sabse zyada!)
//a = 2, b = 2, c = 2, d = 2, e = 2, f = 2, g = 2, h = 2
//Strategy:
//1. Sabse frequent letter (i=6) → 1 push pe rakho
//2. Next 7 letters (a,b,c,d,e,f,g) → 1 push pe rakho
//3. h = 2 → 2 pushes pe rakho (kyunki 8 keys full ho gayi!)
//
//Cost:
//i: 6 × 1 = 6
//a: 2 × 1 = 2
//b: 2 × 1 = 2
//c: 2 × 1 = 2
//d: 2 × 1 = 2
//e: 2 × 1 = 2
//f: 2 × 1 = 2
//g: 2 × 1 = 2
//h: 2 × 2 = 4
//
//Total: 6+2+2+2+2+2+2+2+4 = 24


//Jo letter zyada baar aata hai, usse kam push pe rakhna zyada beneficial hai! because we need to find minimum 

//Example: 'i' 6 baar aata hai
//1 push pe rakha → 6 × 1 = 6 cost
//2 push pe rakha → 6 × 2 = 12 cost (double!)
//
//'i' ko 1 push pe rakhna sabse important hai!

// so the steps are 
// count the frequency
// reverse the frequency array in descending order ie 6 comes at very top
// then assign the pushes 6 ko 1 push baki 7 keys ko 1 push 


//Once frequency[i] == 0, every element after index i is also guaranteed to be 0. The break simply stops the loop early — it's an optimization to avoid useless iterations. Even without it, the answer would be the same because 0 * pushes = 0, but breaking early is slightly more efficient.

