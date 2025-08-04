package heap_and_priority_queue;
import java.util.*;


public class Heapclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Heap hp = new Heap();
		PriorityQueue<Integer> hp  = new PriorityQueue<>(); // min heap
//		PriorityQueue<Integer> hp = new PriorityQueue<>(Collections.reverseOrder()); // max heap
		
		
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
//      	hp.Display();
		System.out.println(hp);

	}

}
