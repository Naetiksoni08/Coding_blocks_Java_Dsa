package blind_45_days_sheet;

public class count_good_cyclic_rotations {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int half = n / 2;
		long firsthalfsum = 0;
		long secondhalfsum = 0;
		for (int i = 0; i < half; i++) {
			firsthalfsum += arr[i];
		}
		for (int i = half; i < n; i++) {
			secondhalfsum += arr[i];
		}
		int ans = 0;
		if (firsthalfsum > secondhalfsum) {
			ans++;
		}
		for (int i = 1; i < n; i++) { // loop starting from i so access i-1
			firsthalfsum = firsthalfsum - arr[i - 1] + arr[(i - 1 + half) % n];
			secondhalfsum = secondhalfsum - arr[(i - 1 + half) % n] + arr[i - 1];

			if (firsthalfsum > secondhalfsum) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}

//You remember the question named "count rotations with exactly k equal adjacent pairs." The logic in that question was that we had implemented a brute-force approach because the constraints were very small.

//This question is kind of similar because in that question also we were just rotating the string and in this question we are just rotating the array, right? The very first thing before going to the actual optimal approach is that the constraints of this question are big, right? If we try to implement the approach that we have used in the previous question, which I just named, then it would have given TLE, right? The time complexity would have been O(n^2). That means 10 / 10 rays per hour, 10 operations in a second, which will definitely give TLE, right? The reason for TLE was that 
//The thing is, the reason was that when we were moving from one rotation to another (that means, let's say, we had just calculated the rotation for the very first time), now we are trying to calculate the rotation for the second time. When we were just trying to calculate the rotation for the second time, we were computing the sum again, due to which what was happening was Due to this sum computation This sum computation was O(n), right? The first time we need to calculate the first sum and the second sum manually. It's an initial setup that we have to do. We are calculating it for i = 0, right? The time complexity of this sum computation was O(n^2), right?
//Now we observed that when we were moving from one window to another window, from one rotation to another rotation, only a few of the elements were changing, right? As a few elements were changing we figured out a solution and a formula for the first and second sums, right?
//For example for the first sum, we were removing the array of the 0 element and adding the element at index `half + i`, right? In the second sum formula we saw That we were just adding `i + (half)` element and the first array of the 0th element, which was dropped by the first half, we were just adding it to the second half. Due to this observation we constructed a formula and some computation, which was giving O(n), was converted into O(1) and the Time complexity of this question becomes O(n) 
