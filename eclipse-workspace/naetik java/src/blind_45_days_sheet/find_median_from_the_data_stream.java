package blind_45_days_sheet;

import java.util.*;

public class find_median_from_the_data_stream {

	class MedianFinder {
		PriorityQueue<Integer> maxheap;
		PriorityQueue<Integer> minheap;

		public MedianFinder() {
			maxheap = new PriorityQueue<>(Collections.reverseOrder()); // maxheap
			minheap = new PriorityQueue<>(); // minheap
		}

		public void addNum(int num) {
			maxheap.offer(num); // left side add karna is more comfortable tbh

			if (!minheap.isEmpty() && maxheap.peek() > minheap.peek()) {
				minheap.add(maxheap.poll());
			}

			if (maxheap.size() > minheap.size() + 1) {
				minheap.offer(maxheap.poll());
			}
			if (minheap.size() > maxheap.size() + 1) {
				maxheap.offer(minheap.poll());
			}

		}

		public double findMedian() {
			if(maxheap.size() == minheap.size()) {
				return ((maxheap.peek() + minheap.peek())/2.0);
			}
			if(maxheap.size()>minheap.size()) {
				return maxheap.peek();
			}else {
				return minheap.peek();
			}

		}
	}

}
