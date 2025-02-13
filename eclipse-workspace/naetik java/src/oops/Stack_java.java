package oops;

import java.util.Stack;

public class Stack_java {
	// stack is a data structure 

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		System.out.println(st.peek()); // get
		System.out.println(st);
		System.out.println(st.pop());//remove
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		
	

	}//add- push
	//remove-pop
	//get-peek
	//size-size
	//is empty - default value false
	// always remember stack is last in first out 

}
