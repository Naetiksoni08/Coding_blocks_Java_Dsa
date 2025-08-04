package trie;

import java.util.HashMap;

import trie.trie.Node;

public class Trie_contacts {

	class Node{
		HashMap<Character,Node> child = new HashMap<>();
		char ch;
		Boolean isterminal;
		int count = 1;
	}

	private Node root;

	public Trie_contacts () {
		root = new Node();
	}

	}




// longest common prefix
// replace word
// word search 2

