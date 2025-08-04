package hashmap;

import java.util.ArrayList;

public class Hashmap<k, v> { // generic

	class Node {
		k key;
		v val;
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public Hashmap() {
		this(4);
	}

	public Hashmap(int n) {
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	public int hashfun(k key) {
		int idx = key.hashCode() % bukt.size();
		if (idx < 0) {
			idx += bukt.size();
		}
		return idx;
	}

	public void put(k key, v val) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = val;
				return;
			}
			temp = temp.next;
		}
		temp = bukt.get(idx);
		Node nn = new Node();
		nn.key = key;
		nn.val = val;
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / bukt.size(); // threshold factor //loaded factor
		if (lf > thf) {
			rehashing();
		}
	}

	private void rehashing() {
		ArrayList<Node> new_bukt = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			new_bukt.add(null);
		}
		ArrayList<Node> old_bukt = bukt;
		bukt = new_bukt;
		size = 0;
		for (Node temp : old_bukt) {
			while (temp != null) {
				put(temp.key, temp.val);
				temp = temp.next;
			}
		}

	}
	public String toString() {
		String s = "{";
		for(Node temp : bukt) {
			while(temp!=null) {
				s = s+temp.key+"="+temp.val+",";
				temp = temp.next;
			}
		}
		return s+"}";
		
	}

	// contains key
	public boolean containsKey(k key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;

		}
		return false;
	}

	// get
	public v get(k key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.val;

			}
			temp = temp.next;
		}
		return null;
	}

	public v remove(k key) {
		int idx = hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;

		} else if (prev == null) {
			bukt.set(idx, curr.next);
		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return curr.val;

	}

	public int size() {
		return size;
	}

}
