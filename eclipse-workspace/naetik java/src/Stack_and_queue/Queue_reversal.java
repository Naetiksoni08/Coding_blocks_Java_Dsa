package Stack_and_queue;

import Stack_and_queue.Queue;

public class Queue_reversal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.display();
		Reverse(q);
		q.display();

	}

	private static void Reverse(Queue q) throws Exception {
		if(q.isempty()) {
			return;
		}
		// TODO Auto-generated method stub
		int x = q.Dequeue(0);
		Reverse(q);
		q.Enqueue(x);
		
		
	}

}
