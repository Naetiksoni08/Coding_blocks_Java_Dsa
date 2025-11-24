package blind_45_days_sheet;

public class Cycle_Removal_Algo {
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
		}

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

		}

	}

	public Node GetKthNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void CreateCycle() {
		Node nn = GetKthNode(2);
		tail.next = nn;
	}

//order of n^2
	public void CycleRemoval1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;

		}

	}

	// concept yeh hai ki vishali ki gf ko cycle ki lenght jitna aage chala do aur
	// fir dono kop parallel chala do dono ek hi jagah pochenge
	// order of n
	public void CycleRemoval2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// cycle lenght mil gai
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		// cycle ki length tk aage chala do vgf ko
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		// parallel chal do ab dono ko

		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

//bro ab floyed sahab nai kaha ki bhai tum seedha joh hai slow ko lo head par 1 par aur fast ko low seedha meet par 
	public void FloyedCycleAlgo() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head; // 1
		Node fast = meet; // meeting point par
		while (slow.next != fast.next) { // aur ab parallel chala do so humare cycle count krne ka step aur usko phele // cycle ki length tk chalane ka step bach gaya Node meet = hasCycle();
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return slow; // jaha par bhi meet kia dono nai voh return kardo taki hum joh hai usse cycle
								// detect kr paaye
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Cycle_Removal_Algo cy = new Cycle_Removal_Algo();
		cy.AddLast(1);
		cy.AddLast(2);
		cy.AddLast(3);
		cy.AddLast(4);
		cy.AddLast(5);
		cy.AddLast(6);
		cy.AddLast(7);
		cy.AddLast(8);
		cy.CreateCycle();
		cy.CycleRemoval1();
		cy.CycleRemoval2();
		cy.FloyedCycleAlgo();
		cy.Display();
	}

}
