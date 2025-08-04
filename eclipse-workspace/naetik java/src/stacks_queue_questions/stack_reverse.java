package stacks_queue_questions;

import java.util.Stack;

public class stack_reverse {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s);
		insert(s, -6);
		System.out.println(s);

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
