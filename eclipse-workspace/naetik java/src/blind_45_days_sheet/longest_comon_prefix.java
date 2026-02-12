package blind_45_days_sheet;

import java.util.*;

public class longest_comon_prefix {

	class Node {
		char data;
		boolean isterminal;
		HashMap<Character, Node> child = new HashMap<>();
	}

	private Node root;

	public longest_comon_prefix() {
		Node nn = new Node();
		nn.data = '*';
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				Node nn = new Node();
				nn.data = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;
	}

	public String Prefix() {
		StringBuilder ans = new StringBuilder();
		Node curr = root; // curr = *
		while (curr.child.size() == 1 && !curr.isterminal) { // *.child.size==1 yes only f and f is not the terminal
																// node so after l l child are 2 i and o so condition is
																// not true so the output will be only "fl"
			for (Node next : curr.child.values()) { // next=f next = l
				ans.append(next.data); // ans = "f" ans = "fl"
				curr = next; // curr = f; // curr=l
			}
		}
		return ans.toString();
	}

	class Solution {
		public String longestCommonPrefix(String[] strs) {
			if (strs == null || strs.length == 0)
				return "";
			longest_comon_prefix lcp = new longest_comon_prefix();
			for (String word : strs) {
				lcp.insert(word);
			}
			return lcp.Prefix();
		}
	}

}
