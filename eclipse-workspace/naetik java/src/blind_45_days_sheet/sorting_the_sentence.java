package blind_45_days_sheet;

public class sorting_the_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 sentence4 This1 a3";
		String[] str = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= str.length; i++) { // outer loop fixes the order
			for (String token : str) { // token = sentence4
				int pos = token.charAt(token.length() - 1) - '0';// find last character position cuz we need to delete
																	// it and append it in the result and also last
																	// character ko digit mai convert karne ke liye '0'
																	// sai sub kia hai
				if (pos == i) { // now if the pos == i lets say 1==1
					if (sb.length() > 0) // if sb length is greater than 0 then for the Add space before every word
											// except first word
						sb.append(" ");
					sb.append(token.substring(0, token.length() - 1)); // remove the last digit and append it
					break;
				}
			}

		}
		System.out.println(sb.toString());

	}

}
//token = "This1"
//
//token.length()              →  5
//token.length() - 1          →  4
//token.charAt(4)             →  '1'   ← yeh char hai, int nahi!
//'1' - '0'                   →   1    ← char se int conversion!

// say str array comes to be tokens = ["is2", "sentence4", "This1", "a3"] so is2 ke liye if nai chalega pos==i wala so then sentence4 ke liye bhi nai chalega then this1 ke liye chalega append karega and break fir outer loop becomes i=2 then is2 will work 
