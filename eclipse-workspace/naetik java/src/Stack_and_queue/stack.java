package Stack_and_queue;

public class stack {
	private int[] arr;
	private int idx = -1;
	
	public stack() {
		arr = new int[5];
		
	}
	public stack(int n) {
		arr = new int[n];
	}
	
	public boolean isfull()  {
		return idx == arr.length-1;
	}
	
	public boolean isempty() {
		return idx == -1;
	}
	
	
	public int size() {
		return idx+1;
	}
	
	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("bhai stack full hai ");
		}
		idx++;
		arr[idx] = item;
	}
	
	public int pop(int item) throws Exception {
		if(isempty()) {
			throw new Exception("bhai stack full hai ");
		}
		int rv = arr[idx];
		idx--;
		return rv;
	}
	public int peak() throws Exception {
		if(isempty()) {
			throw new Exception("bhai stack full hai ");
		}
		int rv= arr[idx];
		return rv;
	}

	public void display() {
		for(int i = 0; i<=idx; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	

	
	
	
	
	

}



//push
//pop
//peak



	
