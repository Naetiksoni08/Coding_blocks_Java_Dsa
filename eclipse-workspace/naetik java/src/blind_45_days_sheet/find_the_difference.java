package blind_45_days_sheet;

import java.util.*;;

public class find_the_difference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0) + 1);

		}
		for (char c : t.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) == 0) {
				System.out.println(c);
			}
			map.put(c, map.get(c) - 1); // ek freq kam karo agar mil jata hai character toh
		}

		System.out.println(' '); // return type is char so that why need to return something atleast
	}

}

//s = "aab"
//
//c='a' → map={a:1}
//c='a' → map={a:2}  ✓
//c='b' → map={a:2, b:1}
//
//t = "aabb"
//c='a' → freq=2→1
//c='a' → freq=1→0
//c='b' → freq=1→0
//c='b' → freq=0 → return 'b' ✓