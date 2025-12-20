package blind_45_days_sheet;

import java.util.*;

public class All_path_from_src_to_target {

	List<List<Integer>> ans = new ArrayList<>();

	class Solution {
		public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
			printAllPath(0, graph, new ArrayList<>());
			return ans;

		}

		public void printAllPath(int src, int[][] graph, List<Integer> result) {
			result.add(src);
			if (src == graph.length - 1) {
				ans.add(new ArrayList<>(result));
				result.remove(result.size() - 1);
				return;
			}
			for (int x : graph[src]) {
				printAllPath(x, graph, result);
			}
			result.remove(result.size() - 1);
		}

	}
}
