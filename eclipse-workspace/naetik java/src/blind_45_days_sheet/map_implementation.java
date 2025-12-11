package blind_45_days_sheet;

import java.util.*;

public class map_implementation<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public map_implementation(int n) {
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null); // if there is no for loop then the bukt size will be 0 but with for loop the
							// size becomes n
		}
	}

	public map_implementation() {
		this(4);
	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		} // a new entry
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = bukt.get(idx);
		// we will do add first
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
		double lf = (1.0 * size) / bukt.size(); // load factor
		double thf = 2.0; // threshold value the lf should never exceed threshold
		if (lf > thf) {
			rehashing(); // after implementing this the tc becomes constast order of 1 currently it is
							// order of n
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
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}

	}

	public Boolean containsKey(K key) {
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

	public V get(K key) {
		int idx = hashfun(key);
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
		} else if (prev == null) { // remove first
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

	public int hashfun(K key) { // tells the idx
		int n = key.hashCode() % bukt.size();
		if (n < 0) { // if n is negative
			n += bukt.size();
		}
		return n; 

	}

	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ",";
				temp = temp.next;
			}
		}
		s= s.trim();
		return s+"}";
	}

}

//	this(4);// ek hi file mai jab ek constructor sai hume dusre constructor ko call karvana
//			// ho toh this keyword mai uske parameter pass kardo appne aap voh uppar wale
//			// constructor ko call karega aur array list ko intialize karke loop lagake 4
//			// bari null put kardega
