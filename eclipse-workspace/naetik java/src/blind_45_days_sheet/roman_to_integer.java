package blind_45_days_sheet;

import java.util.*;

public class roman_to_integer {

	public static void main(String[] args) {
		String s = "LVIII";
		int sum = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for (int i = 0; i < s.length(); i++) {
			int curr = map.get(s.charAt(i));
			int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

			if (curr < next) { // substract
				sum -= curr;
			} else { // add
				sum += curr;

			}
		}
		System.out.println(sum);

	}

}

//I V → I < V → subtract → -1 + 5 = 4
//X I → X > I → add → 10 + 1 = 11
