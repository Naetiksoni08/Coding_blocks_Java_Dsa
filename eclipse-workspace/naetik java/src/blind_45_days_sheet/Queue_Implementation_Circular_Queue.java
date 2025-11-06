package blind_45_days_sheet;

public class Queue_Implementation_Circular_Queue {
	private int[] arr;
	private int front = 0;
	private int size = 0;

	public Queue_Implementation_Circular_Queue() {
		arr = new int[5];
	}

	public Queue_Implementation_Circular_Queue(int n) {
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

	public void Enqueue(int item) throws Exception {
		if (IsFull()) {
			throw new Exception("Queue is full");
		}
//		arr[size + front] = item;
//		size++; if wanna tell someone that im standing at 1 go and stand +2 from me so 1+2 = 3 he will stand on 3
		// jaise hi front + size goes beyond the length take the answer with mod
		// so 5%5 = 0 idx 6%5 = 1 idx
		// in circular queue, we can not access the piche wale element
		int idx = (front + size) % arr.length; // this is circular queue why arr.length because arr can be of 5 size or
												// n size so we dont know what user enters
		arr[idx] = item;
		size++;

	}

	public int Dequeue() throws Exception {
		if (IsEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = arr[front];
		front = (front + 1) % arr.length; // this is circular queue // jaise hi length sai bhar gaya vaise hi mod lelo
											// aur 0th idx par le aao
		size--;
		return rv;
	}

	public int GetFront() throws Exception {
		if (IsEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return arr[front];
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length; // 60,-,30,40,50 ---> front=2 (2+0)%5 = 2 ka data print hoga and so on..
			System.out.print(arr[idx] + " ");
		}
		System.out.println();

	}

}
