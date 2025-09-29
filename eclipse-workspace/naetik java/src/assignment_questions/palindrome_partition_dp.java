package assignment_questions;

import java.util.*;

public class palindrome_partition_dp {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		List<List<String>> ans = partition(s);

		System.out.print("[");
		for (int i = 0; i < ans.size(); i++) {
			System.out.print("[");
			for (int j = 0; j < ans.get(i).size(); j++) {
				System.out.print("\"" + ans.get(i).get(j) + "\"");
				if (j != ans.get(i).size() - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
			if (i != ans.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

		sc.close();

	}

	private static List<List<String>> partition(String s) {

		List<List<String>> ans = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		pallindromePartitioning(s, ans, temp);

		return ans;
	}

	private static void pallindromePartitioning(String s, List<List<String>> ans, List<String> temp) {
		if (s.isEmpty()) {
			ans.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 1; i <= s.length(); i++) {
			String anstring = s.substring(0, i);
			if (ispalidrome(anstring)) {
				temp.add(anstring);
				String quesString = s.substring(i);
				pallindromePartitioning(quesString, ans, temp);
				temp.remove(temp.size() - 1);

			}

		}
	}

	private static boolean ispalidrome(String anstring) {
		int i = 0;
		int j = anstring.length() - 1;
		while (i < j) {
			if (anstring.charAt(i) != anstring.charAt(j)) {
				return false;

			}
			i++;
			j--;
		}
		return true;
	}

}
