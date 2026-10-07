package blind_45_days_sheet;

import java.util.*;

public class Remove_Invalid_parenthesis {

	public static void main(String[] args) {
		String s = "()())()";
		List<String> result = new ArrayList<>();
		Set<String> visited = new HashSet<>();
		Queue<String> queue = new LinkedList<>();

		visited.add(s);
		queue.offer(s);
		boolean found = false;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				String curr = queue.poll();

				if (isValid(curr)) {
					result.add(curr);
					found = true;
				}
				if (found)
					continue;

				for (int j = 0; j < curr.length(); j++) {
					char ch = curr.charAt(j);
					if (ch != '(' && ch != ')')
						continue;

					String next = curr.substring(0, j) + curr.substring(j + 1);
					if (!visited.contains(next)) {
						visited.add(next);
						queue.offer(next);

					}
				}
			}
			if (found)
				break;

		}
		System.out.println(result);
		return;

	}

	public static boolean isValid(String s) {
		int balance = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				balance++;
			} else if (ch == ')') {
				balance--;
				if (balance < 0)
					return false;
			}
		}
		return balance == 0;
	}

}
