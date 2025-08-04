package heap_and_priority_queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class meeting_room_2 {

	public static void main(String[] args) {
		int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 } };
		System.out.println(minrooms(intervals));

	}

	public static int minrooms(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]); 
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		pq.add(intervals[0]);
		for(int i = 1; i < intervals.length; i++) {
		if(intervals[i][0]<pq.peek()[1]) {
			pq.add(intervals[i]);
		}
		else {
			pq.poll();
			pq.add(intervals[i]);
			
			
		}
		
		 
		}
		return pq.size();
	}

}
