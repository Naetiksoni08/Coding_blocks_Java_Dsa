package assignment_questions;

import java.util.*;

public class Hoodies_at_coding_blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int query = sc.nextInt(); // no of queries 5

		Queue<Integer> mainQueue = new LinkedList<>();

		Queue<Integer>[] courseQueue = new LinkedList[5]; // index 1 to 4

		for (int i = 1; i <= 4; i++) {
			courseQueue[i] = new LinkedList<>();
		}

		for (int i = 0; i < query; i++) {
			String str = sc.next();

			if (str.equals("E")) {
				int courseid = sc.nextInt();
				int rollno = sc.nextInt();

				if (courseQueue[courseid].isEmpty()) {
					mainQueue.add(courseid);
				}
				courseQueue[courseid].add(rollno);
			} else if (str.equals("D")) {
				int course = mainQueue.peek();
				int roll = courseQueue[course].poll();
				System.out.println(course + " " + roll);

				if (courseQueue[course].isEmpty()) {
					mainQueue.poll();
				}
			}

		}
	}
}
