package oops;

public class Queue {
	private int[] arr;
	private int front = 0;
	private int size = 0;

	public Queue() {
		arr = new int[5];

	}

	public Queue(int n) {
		arr = new int[n];

	}

	public boolean IsEmpty() {

		return size == 0;

	}

	public void Enqueue(int item) throws Exception { // ADD
		if (isfull()) {
			throw new Exception("bklol quue full hai");
		}
		int idx = (size + front) % arr.length;
		arr[idx] = item;
		size++;
	}

	public int Dequeue(int item) throws Exception { // removing
		
		if (IsEmpty()) {
			throw new Exception("bklol queue khali hai");
		}
		
		int rv = arr[item];
		front = (front + 1) % arr.length;
		size--;
		return rv;

	}

	public int getfront(int item) throws Exception { // get
		if (IsEmpty()) {
			throw new Exception("bklol queue khali hai");
		}
		int rv = arr[item];
		return rv;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public int size() {
		return size;

	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");

		}
		System.out.println();
	}

}
// Enqueue-add
// dequeue - remove
// size- size
// queue stands for first come first serve or fifo that is first in first out
//
