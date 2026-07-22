package blind_45_days_sheet;

import java.util.*;

public class rearrange_string_to_avoid_character_pair {
	public static void main(String[] args) {
		String s = "aabc";
		char x = 'a';
		char y = 'c';
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}   // {a:2,b:1,c:1}
		StringBuilder ans = new StringBuilder();
		int ycount = map.getOrDefault(y, 0); // y ki value return karo agar y nai hai map mai toh fir 0 return karo 
		for (int i = 0; i < ycount; i++) { // y ka count map mai mltb c ka count 1 
			ans.append(y); // ans='c'
		}
		for (char c : map.keySet()) { //key set mai ayega a,b,c
			if (c != x && c != y) { //kya a==a yes skip kya b==a no 
				int count = map.get(c); // count = b yani 1 
				for (int i = 0; i < count; i++) { // 1 time chalega loop
					ans.append(c); //ans='cb'
				}
			}
		}
		int xcount = map.getOrDefault(x, 0); // x is a and a map mai 2 bar hai
		for (int i = 0; i < xcount; i++) { // 2 baar a add hoga
			ans.append(x); // 'cbaa'
		}
		System.out.println(ans.toString());

	}// x and y bas refrence ke liye dia hai ki yeh dono values hai 

}
