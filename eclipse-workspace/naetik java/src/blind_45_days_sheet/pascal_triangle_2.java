package blind_45_days_sheet;

import java.util.*;

public class pascal_triangle_2 {

	public static void main(String[] args) {
		int rowidx = 3;
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i <= rowidx; i++) {
			Integer[] row = new Integer[i + 1];
			Arrays.fill(row, 1);
			for (int j = 1; j < i; j++) {
				row[j] = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
			}
			result.add(Arrays.asList(row));

		}
		System.out.println(result.get(rowidx));
	}

}

//int x = 5;      // primitive → direct value store!
// Integer x = 5;  // non-primitive → object → reference store!

//int x = 5;
//Integer y = x;  // autoboxing → int to Integer automatically!
//int z = y;      // unboxing → Integer to int automatically!

//primitive types 
//int, long, double, float,
//char, boolean, byte, short

// non primitive types
//Wrapper Classes:
//Integer, Long, Double, Float,
//Character, Boolean, Byte, Short
//
//Other:
//String
//Arrays (int[], String[])
//Classes (any class you create!)
//Collections (List, Map, Set)