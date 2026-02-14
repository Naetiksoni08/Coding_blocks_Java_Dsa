package blind_45_days_sheet;

import java.util.*;


public class palindromic_path_queries_in_a_tree {

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        
        // Step 1 - Graph banao
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // String ko char array banao taaki update easy ho
        char[] nodes = s.toCharArray();
        List<Boolean> result = new ArrayList<>();

        // Step 2 - Queries loop
        for (String query : queries) {
            String[] suneravilo = query.split(" "); // required variable

            if (suneravilo[0].equals("update")) {
                int node = Integer.parseInt(suneravilo[1]);
                nodes[node] = suneravilo[2].charAt(0);

            } else if (suneravilo[0].equals("query")) {
                int start = Integer.parseInt(suneravilo[1]);
                int end = Integer.parseInt(suneravilo[2]);

                // BFS se path nikalo
                List<Integer> path = bfs(graph, start, end, n);

                // Palindrome check karo
                result.add(isPalindrome(path, nodes));
            }
        }

        return result;
    }

    // Step 3 - BFS
    private List<Integer> bfs(List<List<Integer>> graph, int start, int end, int n) {
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (curr == end) break;

            for (int neighbor : graph.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = curr;
                    queue.add(neighbor);
                }
            }
        }

        // Path reconstruct karo
        List<Integer> path = new ArrayList<>();
        int curr = end;
        while (curr != -1) {
            path.add(curr);
            curr = parent[curr];
        }
        Collections.reverse(path);
        return path;
    }

    // Step 4 - Palindrome Check
    private boolean isPalindrome(List<Integer> path, char[] nodes) {
        int[] freq = new int[26];

        for (int node : path) {
            freq[nodes[node] - 'a']++;
        }

        int odd = 0;
        for (int f : freq) {
            if (f % 2 != 0) odd++;
        }

        return odd <= 1;
    }

    public static void main(String[] args) {
        palindromic_path_queries_in_a_tree obj = new palindromic_path_queries_in_a_tree();
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}};
        String s = "aac";
        String[] queries = {"query 0 2", "update 1 b", "query 0 2"};
        System.out.println(obj.palindromePath(n, edges, s, queries));
        // Output: [true, false]
    }
}
