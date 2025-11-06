package blind_45_days_sheet;

public class Stack_Implementation { // LIFO
	private int[] arr;
	private int idx = -1;

	public Stack_Implementation() {
		arr = new int[5];
	}

	public Stack_Implementation(int n) {
		arr = new int[n];
	}
    //O(1)
	public boolean isEmpty() {
		return idx == -1;
	}
	 //O(1)
	public boolean isFull() {
		return idx == arr.length - 1;
	}
	 //O(1)
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full");
		}
		idx++;
		arr[idx] = item;

	}
	 //O(1)
	public int pop() throws Exception { 
		if(isEmpty()) {
			throw new Exception("Stacks is Empty"); // called underflow 
		}
		int rv = arr[idx];
		idx--;
		return rv;
	}
	 //O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stacks is Empty");
		}
		int rv = arr[idx];
		return rv;

	}
	 //O(1)
	public int size() {
		return idx + 1; // because idx started with -1
	}
	 //O(N)
	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.println(arr[i] + " ");

		}
		System.out.println();
	}

}
