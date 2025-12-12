package blind_45_days_sheet;

import java.util.*;

public class map<K, V> {
	class Node {
		K key;
		V value;
		Node next;

	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public map(int n) {
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}

	}

	public map() {
		this(4);
	}

	public void put(K key, V value) {
		int idx = hashFun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = bukt.get(idx);
		// add first
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
		double lf = (1.0 * size) / bukt.size();
		double thf = 2.0;
		if (lf > thf) {
			rehashing();

		}

	}

	private void rehashing() {
		ArrayList<Node> newBukt = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			bukt.add(null);
		}
		ArrayList<Node> oldBukt = bukt;
		bukt = newBukt;
		size = 0;
		for (Node temp : oldBukt) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}

	}

	public boolean ContainsKey(K key) {
		int idx = hashFun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = hashFun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = hashFun(key);
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
			curr.next = null;
			size--;
			return curr.value;
		} else {
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;
		}

	}

	public int hashFun(K key) {
		int n = key.hashCode() % bukt.size();
		if (n < 0) {
			n += bukt.size();
		}
		return n;
	}

	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ", ";
				temp = temp.next;
			}
		}
		s = s.trim();
		return s + "}";
	}

}
