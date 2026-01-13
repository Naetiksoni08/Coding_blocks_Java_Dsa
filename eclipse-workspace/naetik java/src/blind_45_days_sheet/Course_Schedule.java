package blind_45_days_sheet;

import java.util.*;

public class Course_Schedule {

	class Solution {
		public boolean canFinish(int numCourses, int[][] prerequisites) {
			List<List<Integer>> graph = new ArrayList<>();
			for (int i = 0; i < numCourses; i++) {
				graph.add(new ArrayList<>());
			}
			int[] indegree = new int[numCourses];

			for (int[] p : prerequisites) {
				int course = p[0]; // the course we want to do
				int prereqneed = p[1]; // the course that must be done first inorder to do the upar wala course
				graph.get(prereqneed).add(course); // Finish 0 → unlock 1 and 2 Finish 1 → unlock 3
				indegree[course]++;// that means ki course yani p of 0 needs 1 prerequisite mtlb 1 dependency hai

			}
			Queue<Integer> q = new LinkedList<>();
			for (int i = 0; i < numCourses; i++) {
				if (indegree[i] == 0) { // there is no dependency at this course we can complete this one yani ki aisi
										// situation nai hai ki 1 ko complete karne ke liye 0 karna padega
					q.add(i);
				}
			}
			int completedcourse = 0;
			while (!q.isEmpty()) {
				int rv = q.poll();
				completedcourse++; // ek course hogaya

				for (int next : graph.get(rv)) {
					indegree[next]--; // ek dependency kam hogai pre req kam kardo 1 sai
					if (indegree[next] == 0) {
						q.add(next);
					}
				}
			} // return only when jab num course ke equal hojata hai complete course
			return completedcourse == numCourses;
		}
	}
}
