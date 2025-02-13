package oops;

public class Queue_reverse11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		reverse(q);
		q.Display();
		

	}

	private static void reverse(Queue q) throws Exception  {
		if(q.IsEmpty()) {
			return;
		}
		int x = q.Dequeue(1);
		reverse(q);
		q.Enqueue(x);
		
		
	}


}
