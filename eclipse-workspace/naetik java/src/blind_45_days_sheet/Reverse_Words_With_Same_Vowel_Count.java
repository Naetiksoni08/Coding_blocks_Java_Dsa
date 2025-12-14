package blind_45_days_sheet;

public class Reverse_Words_With_Same_Vowel_Count {

	public static void main(String[] args) {
		String s = "book is nice";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String[] word = s.split(" "); //["book", "is", "nice"]
		int count = countvowel(word[0]); // book gaya hoga in count vowel function count 2 aah gaya 
		for (int i = 1; i < word.length; i++) {
			if (countvowel(word[i]) == count) {
				word[i] = new StringBuilder(word[i]).reverse().toString();

			}
		}
		return String.join(" ", word); // Har word ke beech ek space daal ke sab words ko jod do.

	}

	public static int countvowel(String word) {
		int count = 0;
		for (char ch : word.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
 // tc and sc is n 
}
