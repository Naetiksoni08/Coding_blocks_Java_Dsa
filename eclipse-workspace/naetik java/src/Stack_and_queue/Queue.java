package Stack_and_queue;

public class Queue {
	private int arr[];
	private int size = 0;
	private int front = 0;

	public Queue() {
		arr = new int[5];

	}

	public Queue(int n) {
		arr = new int[n];
	}

	public boolean isfull() {
		return size == arr.length;

	}

	public boolean isempty() {
		return size == 0;

	}

	public void Enqueue(int item) throws Exception{
		if(isfull()) {
			throw new Exception("bklol queue full hai");
		}
		int idx = (front+size) % arr.length;
		arr[idx] = item;
		size++;
	}

	public int Dequeue(int item) throws Exception {
		if(isempty()) {
			throw new Exception("bklol queue full hai");
		}
		int rv = arr[front];
		front = (front+1)%arr.length;
		size--;
		return rv;
	}

	public int getfront() {
		int rv = arr[front];
		return rv;
	}

	public int size() {
		return size;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx] + " ");

		}
		System.out.println();
	}
}
