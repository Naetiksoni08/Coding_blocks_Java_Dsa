package blind_45_days_sheet;

public class Queue_Implementation_Linear_Queue  {// FIFO(linear queue)
	private int[] arr;
	private int front = 0;
	private int size = 0;

	public Queue_Implementation_Linear_Queue() {
		arr = new int[5];
	}

	public Queue_Implementation_Linear_Queue(int n) {
		arr = new int[n];
	}

	public boolean IsEmpty() {
		return size == 0;
	}

	public boolean IsFull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	public void Enqueue(int item) {
//		arr[size + front] = item;
//		size++; if wanna tell someone that im standing at 1 go and stand +2 from me so 1+2 = 3 he will stand on 3 
		int idx = front + size;
		arr[idx] = item;
		size++;

	}

	public int Dequeue() {
		int rv = arr[front];
		front++;
		size--;
		return rv;
	}

	public int GetFront() {
		return arr[front];
	 }

	public void Display() {
		for (int i = 0; i <= size; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

	}

}
