package Stack_and_queue;

import java.util.*;

public class stack_client {

	public static void main(String[] args) throws Exception {
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);		
		s.display();
		System.out.println(s.peak());
		s.display();
//		System.out.println(s.pop(40));
		s.display();
		System.out.println(s.size());
		System.out.println(s.isempty());
		System.out.println(s.isfull());
		s.push(50);	
		s.display();
		System.out.println(s.isfull());
		
	}

}
