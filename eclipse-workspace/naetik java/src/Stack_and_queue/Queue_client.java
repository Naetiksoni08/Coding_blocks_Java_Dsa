package Stack_and_queue;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.display();
		System.out.println(q.Dequeue(0));
		System.out.println(q.Dequeue(0));
		q.Enqueue(50);
		q.Enqueue(60);
		q.display();
		
		
	}

}
