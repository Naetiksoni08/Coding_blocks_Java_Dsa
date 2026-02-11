package blind_45_days_sheet;

import java.util.*;

public class Trie_implementation {

	class Node {
		char data;
		boolean isterminal;
		HashMap<Character, Node> child = new HashMap<>();
	}

	private Node root;

	public Trie_implementation() {
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

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return curr.isterminal; // if it matches then we will check whether the last node is the terminal node o
								// not if it is then return true
	}

	public boolean startsWith(String prefix) { // same thing just we will not check its terminal at the end its
												// basically checks if app as a prefix hai ya nai
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}
}
