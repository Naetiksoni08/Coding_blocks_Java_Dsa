package blind_45_days_sheet;

import java.util.*;

public class count_sequences_to_k {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 2 };
		HashMap<String, Integer> map = new HashMap<>();
		int k = 6;
		System.out.println(countsequence(arr, 0, 1, 1, k, map));
	}

	public static int countsequence(int[] arr, int i, long num, long den, long k, HashMap<String, Integer> map) {

		if (arr.length == i) {
			return num == k * den ? 1 : 0;
		}
		String key = i + "," + num + "," + den;
		if (map.containsKey(key)) {
			return map.get(key); // already computed!
		}

		int x = arr[i];
		int count = 0;
		count += countsequence(arr, i + 1, num * x, den, k, map); // multiply
		count += countsequence(arr, i + 1, num, den * x, k, map); // divide
		count += countsequence(arr, i + 1, num, den, k, map); // leave as it is
		map.put(key, count);
		return count;
	}

}

//Three Operations
//val = num/den aur current element = x
//Multiply:

//num * x / den
//→ new num = num * x
//→ new den = den
//Divide:

//num / (den * x)
//→ new num = num
//→ new den = den * x
//Leave unchanged:

//→ new num = num
//→ new den = den

//DP mein hum repeated subproblems cache karte hain. Normal DP mein array lete hain like dp[i] ya dp[i][j].
//But yahan state hai (i, num, den) — num aur den bahut bade numbers ho sakte hain, array index nahi ban sakte! Isliye HashMap liya — koi bhi value key ban sakti hai!

//State teen cheezein hain — i, num, den. HashMap mein ek key chahiye toh teeno ko join kar diya:// e.g. "1,2,1" matlab i=1, num=2, den=1