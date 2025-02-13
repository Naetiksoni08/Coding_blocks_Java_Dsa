package oops;

public class queue_client {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Display();
		System.out.println(q.Dequeue(0));
		System.out.println(q.Dequeue(1));
		q.Enqueue(50);
		q.Enqueue(60);
		q.Display();
		

	}

}
