package blind_45_days_sheet;

public class goat_latin {

	public static void main(String[] args) {
		String sentence = "I speak Goat Latin";
		StringBuilder sb = new StringBuilder();
		String[] arr = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String a = arr[i];
			char firstChar = Character.toLowerCase(a.charAt(0));
			String word;
			if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
				word = a + "ma";
			} else {
				word = a.substring(1) + a.charAt(0) + "ma";
			}
			StringBuilder aTail = new StringBuilder();
			for (int k = 0; k <= i; k++) {
				aTail.append('a');
			}
			sb.append(word).append(aTail);

			if (i != arr.length - 1) { // kyuki agar yeh check nai lagaya toh fir har jagah even last word ke baad
										// space add ho jayega toh voh galat ho jayega toh jab last index par last word
										// par ho toh space nai add karna
				sb.append(" "); // Sirf tab space add karo jab ye last word na ho
			}
		}
		System.out.println(sb.toString());
	}

}
