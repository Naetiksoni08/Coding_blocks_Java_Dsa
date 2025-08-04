package stacks_queue_questions;

import java.util.Stack;

public class stacks_real_reverse {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s);
		reverse(s);
		System.out.println(s);

	
	}
	private static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int x = s.pop();
		reverse(s);
		insert(s,x);
		
	}
	public static void insert(Stack<Integer> s, int item) {
		if(s.isEmpty()) {
			s.push(item);
			return;
		}
		int x = s.pop();
		insert(s,item);
		s.push(x);
		
	}

}
