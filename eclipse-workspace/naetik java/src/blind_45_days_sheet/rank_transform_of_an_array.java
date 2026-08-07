package blind_45_days_sheet;

import java.util.*;

public class rank_transform_of_an_array {

	public static void main(String[] args) {
		int[] arr = { 100, 100, 100 };
		int[] temp = arr.clone();
		Arrays.sort(temp);

		HashMap<Integer, Integer> rankMap = new HashMap<>();
		int rank = 1;
		for (int n : temp) {
			if (!rankMap.containsKey(n)) {
				rankMap.put(n, rank);
				rank++;
			}

		}
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = rankMap.get(arr[i]);
		}
//		return result;
	}

}
// and the best part of this approach is that it is even handling the duplicates see how

// if arr=100,100,100
// temp = 100,100,100 
// rankmap = 100:1 final map
// result.length = 3
// loop = 0->3 yani 0,1,2
// result[0] = rankmap.get(100)
//result = 1 
// next time result[i] = rankmap.get(100) again 1 and again 1 so final answer would be
// result = [1,1,1];