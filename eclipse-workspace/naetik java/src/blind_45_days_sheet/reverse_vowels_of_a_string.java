package blind_45_days_sheet;

public class reverse_vowels_of_a_string {

	public static void main(String[] args) {
		String s = "IceCreAm";
		char[] word = s.toCharArray();
		String vowel = "aeiouAEIOU";
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < j && vowel.indexOf(word[i]) == -1) {
				i++;
				// indexOf() function: Ye check karta hai ki koi character us string ke andar
				// maujood hai ya nahi. Agar mil gaya: Toh ye uska index return karta hai (0, 1, 2...).Agar nahi mila: Toh ye hamesha -1 return karta hai.

			}
			while (i < j && vowel.indexOf(word[j]) == -1) {
				j--;
			}
			char temp = word[i];
			word[i] = word[j];
			word[j] = temp;

			i++;
			j--;
		}
//		return new String(word);
	}

}
