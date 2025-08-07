package heap_and_priority_queue;

import java.util.PriorityQueue;

public class minimum_sum_pair {

	public static void main(String[] args) {
		int[] arr = { 3,2,4,2,3 };
		System.out.println(minimum_pair(arr));
	}

	public static int minimum_pair(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);

		}
		int sum = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			sum += a + b;
			pq.add(a + b);
		}
		return sum;
	}

}
