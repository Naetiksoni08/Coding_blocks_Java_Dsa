package assignment_questions;

import java.util.*;

public class Importance_of_time {

	protected int size;

	protected int front;
	protected int[] data;

	public Importance_of_time() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Importance_of_time(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enQueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("Main is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int deQueue() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.print("END");
	}

	public static int ImpofTime(Importance_of_time q, int[] orig_order) throws Exception {
		int idx = 0;
		int time = 0;
		while (!q.isEmpty()) {
			if (q.getFront() == orig_order[idx]) { // calling ka 1st element == ideal ka array ka 1st element ke toh 
				q.deQueue();  // sirf calling queue mai sai delete kardia
				time++;
				idx++;

			} else { // if not equals then 
				int val = q.deQueue(); // value milgai // calling queue mai value leli
				q.enQueue(val); // aur enqueue mtlb push kardia 
				time++;
			}
		}

		return time;

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		Importance_of_time q = new Importance_of_time();

		int n = scn.nextInt();
		int[] process = new int[n];
		for (int i = 0; i < n; i++) {
			q.enQueue(scn.nextInt());
		}

		for (int i = 0; i < n; i++) {

			process[i] = scn.nextInt();
		}

		System.out.print(ImpofTime(q, process));

	}

}

//q--> calling arr hai .. queue hai [5,4,2,3,1]..
// orig-order-->normal array hai [5,2,1,4,3]



//public static int calculateTime(Queue<Integer> calling, Queue<Integer> ideal) {
//	int time = 0;
//	while (!calling.isEmpty()) {
//		if (calling.peek().equals(ideal.peek())) {
//			calling.poll();
//			ideal.poll();
//			time++;
//		} else {
//			calling.offer(calling.poll()); // offer is used to add a element at the last of the queue
//			time++;
//		}
//	}
//
//	return time;
//}