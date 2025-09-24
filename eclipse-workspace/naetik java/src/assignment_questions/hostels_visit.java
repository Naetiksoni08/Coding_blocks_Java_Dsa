package assignment_questions;

import java.util.*;

public class hostels_visit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long q = sc.nextLong();
		long K = sc.nextLong();
		PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap
		while (q-- > 0) {
			int querytype = sc.nextInt();
			if (querytype == 1) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				long distanceSquared = x * x + y * y;
				if (pq.size() < K) {
					pq.add(distanceSquared);
				} else if (distanceSquared < pq.peek()) {
					pq.poll();
					pq.add(distanceSquared);
				}
			} else if (querytype == 2) {
				System.out.println(pq.peek());
			}
		}
	}
}