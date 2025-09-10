package Java_All_Implementation;

public class Stacks_Implementation {
//lifo - last in first out 
	private int[] arr;
	private int idx = -1; // queue mai 0 rakhdenge index aur -1 indicates that there is no element in the
							// stacks
	// the reason why we made arr private is because we are using array and we want
	// to make the nature of this is arr as stacks so if i dont make it private then
	// when we will make its object then any one can access the index of the array
	// which is not the nature of stacks

	public Stacks_Implementation() {
		// TODO Auto-generated constructor stub
		arr = new int[5]; // by default the size of the arr will be 5
	}

	public Stacks_Implementation(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n]; // if someone want initially n size stacks

	}

	// push pop peak display size isempty isfull size

	public boolean isEmpty() {
		return idx == -1; // returns true or false
		// we took index cuz we need to keep a track of konsai index par hume element
		// rakhna hai isliye
	}

	public boolean isFull() {
		return idx == arr.length - 1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Bro stacks is full!!");
		}
		idx++;
		arr[idx] = item;
	}

	public int size() {
		return idx + 1; // cuz say 5 size tha array ka toh 4th index par last data aaya hoga toh isliye
						// +1 karke return kia jaise arr ka length 5 toh index ka 4 same
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bro stacks is Empty!!");
		}
		int removed_element = arr[idx]; // stored the element we want to delete index yaad kia hai
		idx--; // and simply ek index piche aah gaye
		return removed_element;
	}

	public int peak() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bro stacks is Empty!!");
		}
		int removed_element = arr[idx];
		return removed_element; // top ke element ko simply return kardo
	}

	public void display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println(); 
	}

}

//the reason why we added throws exception is because when we add a element at index which is more than the size of the stack then we will get index out of bound which tells that we are internally using array so in order to hide this we are doing this so that out client doesnt get to know what are we internally using this is called underflow 
