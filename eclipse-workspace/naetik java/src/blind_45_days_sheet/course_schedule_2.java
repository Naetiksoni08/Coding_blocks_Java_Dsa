package blind_45_days_sheet;

import java.util.*;

public class course_schedule_2 {

	class Solution {
		public int[] findOrder(int numCourses, int[][] prerequisites) {
			List<List<Integer>> graph = new ArrayList<>();
			for (int i = 0; i < numCourses; i++) {
				graph.add(new ArrayList<>());
			}
			int[] indegree = new int[numCourses];

			for (int[] p : prerequisites) {
				int course = p[0];
				int prereqneed = p[1];
				graph.get(prereqneed).add(course);
				indegree[course]++;
			}
			Queue<Integer> q = new LinkedList<>();
			for (int i = 0; i < numCourses; i++) {
				if (indegree[i] == 0) {
					q.add(i);
				}
			}
			List<Integer> result = new ArrayList<>();
			while (!q.isEmpty()) {
				int rv = q.poll();
				result.add(rv);

				for (int next : graph.get(rv)) {
					indegree[next]--;
					if (indegree[next] == 0) {
						q.add(next);
					}
				}
			}
			if (result.size() != numCourses) {
				return new int[0];
			}

			int[] ans = new int[numCourses]; // result.size() will also work
			for (int i = 0; i < numCourses; i++) {
				ans[i] = result.get(i);

			}
			return ans;
		}
	}

}



//Is question mein bas yeh batana tha ki
//courses kis order mein choose honge,
//aur humne bola:
//“jo BFS queue se poll hota jaaye, wahi order hai”.

