package blind_45_days_sheet;

import java.util.*;

public class Tries_Contacts_HackerRank {

	class Node {
		char data;
		boolean isterminal;
		HashMap<Character, Node> child = new HashMap<>();
		int count = 1;
	}

	private Node root;

	public Tries_Contacts_HackerRank() {
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
				curr.count++;
			} else {
				Node nn = new Node();
				nn.data = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;
	}

	public int find(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}

	public static void main(String[] args) {
		Tries_Contacts_HackerRank t = new Tries_Contacts_HackerRank();
		t.insert("hacker");
		t.insert("hackerrrr");
		System.out.println(t.find("hac"));
	}

}
