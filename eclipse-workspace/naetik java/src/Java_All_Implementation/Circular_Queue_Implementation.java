package Java_All_Implementation;

public class Circular_Queue_Implementation {

	// lifo - last in first out
	private int[] arr;
	private int front = 0;
	private int size = 0; // size tells 2 things the size of the queue and where to add the element just
							// like idx in the stacks

	public Circular_Queue_Implementation() {
		arr = new int[5];
	}

	public Circular_Queue_Implementation(int n) {
		arr = new int[n];

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == arr.length - 1;
	}

	public int size() {
		return size;
	}

	public void Enqueue(int item) throws Exception { // add method
		if (isFull()) {
			throw new Exception("Bro queue is full!!");
		}
		arr[size] = item;
		size++;

	}

	public int Dequeue() {
		int remove = arr[front + size] % arr.length; // 5%5 = 0 5%6 = 1th index then 2nd index then 5%7 = 2nd index
		front = (front + 1) % arr.length; // jab range sai bhar jayega toh humai isse bhi arr ke length sai mod lena
											// padega
		size--;
		return remove;
	}

	public int GetFront() {
		int getItem = arr[front];
		return getItem;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length; // circular queue hai isliye aisa ho sakta hai ki mere ko waas sai 0th index pr aane pade so isliye maine mod lelia arr ke length say jaise 2+3 = 5 so 5%5 = 0th index ko print kardo aise
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
