package blind_45_days_sheet;

import java.util.*;

public class First_negative_integer_in_every_window_of_size_k {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextLong();
			}
			
			List<Long> ll = firstnegative(arr, k);
			for(long result:ll) {
				System.out.print(result+" ");
			}
			System.out.println();
			
			

		}

	}

	public static List<Long> firstnegative(long[] arr, int k) {
		Queue<Integer> q = new LinkedList<>();
		List<Long> ans = new ArrayList<>(); // we dont know the initial size of our ans array so that why make to make it increase dynamically we tak arraylist
		// for the first window // after finding the ans we got to know the formula for initalizing the ans array it will be n-k+1
		for (int i = 0; i < k; i++) { 
			if (arr[i] < 0) {
				q.add(i);
			}
			
		}
			if (q.isEmpty()) {
				ans.add((long) 0);
			} else {
				ans.add((long) arr[q.peek()]);
			}


		// process for rest window
		for (int i = k; i < arr.length; i++) { 
			if (!q.isEmpty() && q.peek() <= i - k) { // i-k tells us the index of the element that is going OUT of the window.
				q.poll();
			}
			if (arr[i] < 0) {
				q.add(i);
			}
			if (q.isEmpty()) {
				ans.add((long) 0);
			} else {
				ans.add((long) arr[q.peek()]);
			}

		}
		return ans;

	}

}
