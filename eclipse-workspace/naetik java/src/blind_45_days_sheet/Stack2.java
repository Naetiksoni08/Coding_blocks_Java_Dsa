package blind_45_days_sheet;

public class Stack2 {
	private int[] arr;
	private int idx = -1;

	public Stack2(int n) {
		arr = new int[n];
	}

	public Stack2() {
		arr = new int[5];
	}

	public boolean isfull() {
		return idx == arr.length - 1;
	}

	public boolean isempty() {
		return idx == -1;

	}

	public void push(int item) {
		if (isfull()) {
			System.out.println("ghante ka push karu");
			return;
		}
		idx++;
		arr[idx] = item;

	}

	public int peek() {
		 if (isempty()) {
		        System.out.println("Stack is empty!");
		        return -1; 
		    }
		int rv = arr[idx];
		return rv;
	}

	public int pop() {
		 if (isempty()) {
		        System.out.println("Stack is empty!");
		        return -1; 
		    }
		int rv = arr[idx];
		idx--;
		return rv;
	}

	public int size() {
		return idx + 1;
	}

	public void display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + "-->");
		}
		System.out.println();
	}
}
