package blind_45_days_sheet;

public class Linked_List_Implementation {

	class Node {
		int data;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// 0(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

//order of 1 
	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;

		}
	}

	public void AddAtIndex(int item, int k) {
		if (size == 0) {
			AddFirst(item);
		} else if (size == k) {
			AddLast(item);

		} else {
			Node nn = new Node();
			nn.data = item;
			Node K_1th = GetNode(k - 1);
			nn.next = K_1th.next;
			K_1th.next = nn;
			size++;

		}

	}

//order of 1
	public int GetFirst() {
		return head.data;
	}

	// order of 1
	public int GetLast() {
		return tail.data;
	}

	// order of n
	public int GetAtIndex(int k) {
		return GetNode(k).data;
	}

	// order of 1
	public int RemoveFirst() {
		int rv = head.data;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null; // remove the tail

		}
		size--;
		return rv;
	}

//order of 1
	public int RemoveLast() {
		int rv = tail.data;
		if (size == 1) {
			return RemoveFirst();
		} else {
			Node seclast = GetNode(size - 2);
			seclast.next = null;
			tail = seclast;
			size--;
			return rv;
		}

	}

	public int RemoveAtIndex(int k) {
		if (k == 0) {
			return RemoveFirst();
		} else if (k == size - 1) {
			return RemoveLast();
		} else {
			Node K_1th = GetNode(k - 1);
			Node kth = K_1th.next;
			K_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.data;
		}

	}

	private Node GetNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;

		}
		return temp;

	}

//order of N
	public void Diplay() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + "-->");
			temp = temp.next;
		}

	}

	public int size() {
		return size;
	}
}
//due to tail node our complexity got reduced if i wanna do without tail node then the complexity becomes linear ie order of n becuase i have to traverse and then perfrom my operation like addlast because of tail node the complexity becomes order of 1 ie constant 
