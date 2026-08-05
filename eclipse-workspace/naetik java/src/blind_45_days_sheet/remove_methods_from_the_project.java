package blind_45_days_sheet;

import java.util.*;

public class remove_methods_from_the_project {
	public static void main(String[] args) {
		int n = 4;
		int k = 1;
		int[][] invocations = { { 1, 2 }, { 0, 1 }, { 3, 2 } };

		List<Integer>[] graph = new ArrayList[n]; // graph[0] - [1,2] mtlb graph of 0 calls 1 and 2 aise save ho raha
													// hai
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>(); // 0 ->[] // empty list har index ke samne
		}

		for (int[] inv : invocations) {
			int a = inv[0];
			int b = inv[1];
			graph[a].add(b); // 1 calls 2 so graph[1]->[2]

		}

		boolean[] suspicious = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		q.add(k);
		suspicious[k] = true;
		while (!q.isEmpty()) {
			int curr = q.poll();
			for (int nbrs : graph[curr]) {
				if (!suspicious[nbrs]) {
					suspicious[nbrs] = true;
					q.add(nbrs);
				}
			}
		}

		// check whether a safe method calls sus one
		for (int[] inv : invocations) {
			int a = inv[0]; // a calls b
			int b = inv[1];

			if (!suspicious[a] && suspicious[b]) {
				List<Integer> all = new ArrayList<>(); // mtlb violation hai yani ek safe method call karta hai sus ko
				for (int i = 0; i < n; i++) {
					all.add(i);
				}
				// return all;
//Violation hai — koi safe method (!suspicious[a]) suspicious method (suspicious[b]) ko call kar raha hai
			}
		}

		List<Integer> result = new ArrayList<>(); // koi bhi aisa safe method nai hai joh call karta hu sus ko
		for (int i = 0; i < n; i++) {
			if (!suspicious[i]) {
				result.add(i);
			}
		} // Violation nahi hai — koi bhi safe method suspicious ko call nahi kar raha
			// return result;

	}

}
