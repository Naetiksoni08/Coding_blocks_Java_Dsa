package Java_All_Implementation;

public class Linked_List_implementation {

	class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void Addfirst(int item) {
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

		} // order of 1

	}

	public void AddLast(int item) {
		if (size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
			// order of 1
		}
	}

	public void AddatIndex(int item, int k) {
		if (k == 0) {
			Addfirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			Node k_1th_node = GetNode(k - 1);
			nn.next = k_1th_node.next;
			k_1th_node.next = nn;
			size++;

		}
		// order of n cuz of getnode

	}

//order of 1
	public int GetFirst() {
		return head.data;
	}

//order of 1
	public int GetLast() {
		return tail.data;
	}

//order of n 
	public int GetAtIndex(int k) {
		return GetNode(k).data;
	}

	public int RemoveFirst() {
		int rv = head.data;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		size--;
		return rv;
	}

	public int RemoveLast() {
		int rv = tail.data;
		if (size == 1) {
			RemoveFirst();
		} else {
			Node second_last = GetNode(size - 2);
			second_last.next = null;
			tail = second_last;
			size--;

		}
		return rv;

	}

	public int RemoveAtIndex(int k) {
		if (k == 0) {
			RemoveFirst();
		} else if (k == size - 1) {
			RemoveLast();
		} else {
			Node k_1th = GetNode(k - 1);
			Node Kth = k_1th.next;
			k_1th.next = Kth.next;
			Kth.next = null;
			size--;
			return Kth.data;
		}
		return k;
		
		
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--> ");
			temp = temp.next;
		}

	}

	public int size() {
		return size;
	}

	private Node GetNode(int k) {
//		if (k < 0 || k >= size) {
//		throws exception
//		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;

	}

}
