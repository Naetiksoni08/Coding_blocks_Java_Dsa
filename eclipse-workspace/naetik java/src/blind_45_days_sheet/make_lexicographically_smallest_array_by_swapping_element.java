package blind_45_days_sheet;

import java.util.*;

public class make_lexicographically_smallest_array_by_swapping_element {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 9, 8 };
		int limit = 2;
		int n = arr.length;
		int[][] pairs = new int[n][2];
		for (int i = 0; i < n; i++) {
			pairs[i][0] = arr[i]; // value
			pairs[i][1] = i; // index
		}

		Arrays.sort(pairs, (a, b) -> a[0] - b[0]); // sort on the basis of values

		int[] ans = new int[n];

		List<Integer> indices = new ArrayList<>(); // current group ke original indices
		List<Integer> values = new ArrayList<>(); // current group ke values

		for (int i = 0; i < n; i++) {
			values.add(pairs[i][0]);
			indices.add(pairs[i][1]);

			if (i == n - 1 || pairs[i + 1][0] - pairs[i][0] > limit) {
				Collections.sort(indices);

				for (int k = 0; k < indices.size(); k++) {
					ans[indices.get(k)] = values.get(k);
				}

				indices.clear();
				values.clear();
			}

		}
		System.out.println(Arrays.toString(ans));
	}

}

//arr = [1,5,3,9,8]
//
//i=0: pairs[0] = [1, 0]   (value=1, index=0)
//i=1: pairs[1] = [5, 1]   (value=5, index=1)
//i=2: pairs[2] = [3, 2]   (value=3, index=2)
//i=3: pairs[3] = [9, 3]   (value=9, index=3)
//i=4: pairs[4] = [8, 4]   (value=8, index=4)
//
//pairs = [[1,0],[5,1],[3,2],[9,3],[8,4]]

//Sort by first element (value):
//[1,0] → value 1
//[3,2] → value 3
//[5,1] → value 5
//[8,4] → value 8
//[9,3] → value 9
//
//pairs (sorted) = [[1,0], [3,2], [5,1], [8,4], [9,3]]



//pairs sorted: [[1,0],[3,2],[5,1],[8,4],[9,3]]
//
//i=0: values=[1], indices=[0]
//  next diff: pairs[1][0]-pairs[0][0] = 3-1 = 2, <=limit → group continue
//
//i=1: values=[1,3], indices=[0,2]
//  next diff: pairs[2][0]-pairs[1][0] = 5-3 = 2, <=limit → group continue
//
//i=2: values=[1,3,5], indices=[0,2,1]
//  next diff: pairs[3][0]-pairs[2][0] = 8-5 = 3, >limit(2) → GROUP CLOSE!
//  
//  indices.sort() → [0,1,2]
//  values = [1,3,5] (already sorted)
//  ans[0]=1, ans[1]=3, ans[2]=5
//  
//  reset: indices=[], values=[]
//
//i=3: values=[8], indices=[4]
//  next diff: pairs[4][0]-pairs[3][0] = 9-8 = 1, <=limit → group continue
//
//i=4 (last, i==n-1): values=[8,9], indices=[4,3]
//  GROUP CLOSE!
//  
//  indices.sort() → [3,4]
//  values = [8,9] (already sorted)
  ans[3]=8, ans[4]=9