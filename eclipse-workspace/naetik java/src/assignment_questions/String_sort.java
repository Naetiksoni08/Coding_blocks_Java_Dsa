package assignment_questions;

import java.util.*;

public class String_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next(); // arr = ["bat", "apple", "batman"]
		}

		Arrays.sort(str, (s1, s2) -> {
			if (s1.startsWith(s2)) {
				return -1; // s1 is longer, comes first
			} else if (s2.startsWith(s1)) { // corrected here
				return 1; // s2 is longer, comes first
			} else {
				return s1.compareTo(s2); // normal lexicographic order
			}
		});

		for (String s : str) {
			System.out.println(s);
		}
	}
}

// Compare "bat" vs "apple"
//"bat".startsWith("apple")? 
//"apple".startsWith("bat")? 
//Else → "bat".compareTo("apple") = positive → "apple" comes first

//Compare "bat" vs "batman"
//"bat".startsWith("batman")? 
//"batman".startsWith("bat")?  → return 1 → "batman" comes first

//Compare "apple" vs "batman"
//"apple".startsWith("batman")?
//"batman".startsWith("apple")? 
//Else → "apple".compareTo("batman") = negative → "apple" comes first