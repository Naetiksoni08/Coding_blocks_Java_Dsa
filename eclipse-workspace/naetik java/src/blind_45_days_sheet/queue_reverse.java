package blind_45_days_sheet;

import java.util.*;

public class queue_reverse {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println("Original Queue: " + q);
		queue(q);
		System.out.println("Reversed Queue: " + q);

	}

	public static void queue(Queue<Integer> q) {
		Stack<Integer> st = new Stack<>();
		while (!q.isEmpty()) {
			st.push(q.remove()); // queue sai nikala stack mai dala
		}
		while (!st.isEmpty()) {
			q.add(st.pop()); // aur stack sai nikala queue mai dala
		}

	}
}
