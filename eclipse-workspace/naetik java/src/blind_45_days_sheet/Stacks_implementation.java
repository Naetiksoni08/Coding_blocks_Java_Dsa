package blind_45_days_sheet;

public class Stacks_implementation {

	private int[] arr;
	private int idx = -1;

	public Stacks_implementation() {
		// TODO Auto-generated constructor stub
		arr = new int[5];

	}

	public Stacks_implementation(int n) {
		arr = new int[n];
	}

	boolean isEmpty() {
		return idx == -1;
	}

	boolean isFull() {
		return idx == arr.length - 1;

	}

	public void Push(int val) {
		idx++;
		arr[idx] = val;
	}

	public int pop() {
		int rv = arr[idx];
		idx--;
		return rv;
	}

	public int peak() {
		return arr[idx];
	}

	public int size() {
		return idx + 1;

	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		Stack_Implementation st = new Stack_Implementation(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
	}

}
