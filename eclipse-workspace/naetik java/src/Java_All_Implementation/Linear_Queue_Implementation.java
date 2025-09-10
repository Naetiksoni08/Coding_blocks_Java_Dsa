package Java_All_Implementation;

public class Linear_Queue_Implementation {

	//lifo - last in first out 
		private int[] arr;
		private int front = 0; // took so that front sai data nikal paaye
		private int size = 0; // size tells 2 things the size of the queue and where to add the element just like idx in the stacks
	
		public Linear_Queue_Implementation() {
			arr = new int[5]; // by default the size of the arr will be 5
		}

		public Linear_Queue_Implementation(int n) {
			arr = new int[n]; // if someone want initially n size queue

		}
		
		
		
		
		public boolean isEmpty() {
			return size==0;
		}
		
		public boolean isFull() {
			return size == arr.length-1;
		}
		
		public int size() {
			return size;
		}
		public void display() {
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
		}
		
		public void Enqueue(int item) throws Exception { // add method 
			if(isFull()) {
			 throw new Exception("Bro queue is full!!");
			}
			arr[size]=item;
			size++;
			//front ko isliye kyu change nai kia?
			//becuase front agar change kardunga toh mai sabsai phela data or element in the queue ko nai dequeue kar paunga
		}
		public int Dequeue() throws Exception {
			if(isEmpty()) {
				 throw new Exception("Bro queue is Empty!!");
				}
			int remove = arr[front+size]; //why front+size 2+2 = 4 pr enqueue karna tha and this problem is solved by circular queue
			front++;
			size--;
			return remove;
		}
		
		public int GetFront() throws Exception {
			if(isEmpty()) {
				 throw new Exception("Bro queue is Empty!!");
				}
			int getItem = arr[front];
			return getItem;
		}
		
		
		

}
