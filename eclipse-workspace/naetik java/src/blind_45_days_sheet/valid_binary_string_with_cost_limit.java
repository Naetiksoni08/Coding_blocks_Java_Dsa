package blind_45_days_sheet;

import java.util.*;

public class valid_binary_string_with_cost_limit {

	public static void main(String[] args) {
		int n = 3;
		int k = 1;
		List<String> result = new ArrayList<>(); // because list mai fill karke dena hai 
		validstring(n, k, 0, result, 0, new StringBuilder());
		System.out.println(result);
	}

	public static void validstring(int n, int k, int i, List<String> result, int cost, StringBuilder sb) {
		if (sb.length() == n) { // base condition if n ke equal ho jata hai string ki length so simply add it in list and return 
			result.add(sb.toString());
			return;
		}
		sb.append('0'); // append 0 
		validstring(n, k, i + 1, result, cost, sb); // baki ka check karo bas index+1 karna 
		sb.deleteCharAt(sb.length() - 1); // backtrack karo 

		boolean checkprevone = (sb.length() == 0 || sb.charAt(sb.length() - 1) != '1'); // this is taki pichle wala 1 toh nai tha voh check karo character
		boolean calccost = (cost + i <= k); // cost with in the bounds honi chahiye
		if (checkprevone && calccost) { // agar dono true hai toh fir 1 append kar sakte ho go ahead
			sb.append('1');  // append one
			validstring(n, k, i + 1, result, cost + i, sb); // i+1 and cost+i because cost mai index jodhna hai 
			sb.deleteCharAt(sb.length() - 1);
		}
	}

}

//StringBuilder ek hi object hai — shared hai sabke saath!
//
//n=3, k=1
//
//sb = "0" append kiya
//  sb = "00" append kiya
//    sb = "000" → result mein add!
//    
//  ab wapas aana hai "0" pe
//  "00" se '0' delete karo → sb = "0"  ← BACKTRACK!
//  
//  ab "01" try karo
