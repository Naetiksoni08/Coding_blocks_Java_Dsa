package assignment_questions;

import java.util.Scanner;
import java.util.Stack;

public class Dequeue_efficient_queue_using_stack {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		DequeueEfficent dq = new DequeueEfficent();
		for (int i = 0; i < n; i++) { 
			dq.Enqueue(i); // enqueue karvaya
		}
		 while (!dq.isEmpty()) {
			 System.out.print(dq.Dequeue() + " "); // jab tk empty nai ho jata print kardo
		 }

	}

	static class DequeueEfficent {

		Stack<Integer> Stack = new Stack<>(); 
		Stack<Integer> helper = new Stack<>();

		public void Enqueue(int item) { // push
			while (!Stack.isEmpty()) { 
				helper.push(Stack.pop()); // stack mai sai data pop kia aur helper wale mai push kia
			
			}
			Stack.push(item); // if ek aur naya element aah gya toh stack mai push kardo

			while (!helper.isEmpty()) { // 
				Stack.push(helper.pop());// helper mai sai pop kia aur stack mai again push kia

			}
		}

		public int Dequeue() throws Exception {
			if (Stack.isEmpty()) {
				throw new Exception("Queue is empty");
			}
			return Stack.pop();

		}

		public boolean isEmpty() {
			return Stack.isEmpty();
		}

	}

}
