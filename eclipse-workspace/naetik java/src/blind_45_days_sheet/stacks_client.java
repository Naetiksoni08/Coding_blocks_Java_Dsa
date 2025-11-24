package blind_45_days_sheet;

import java.util.*;

public class stacks_client {
	
	public static void main(String[] args) {
		Stack2 st = new Stack2();
		st.push(10);
		st.push(20);
		st.push(30);
		st.display();
		System.out.println(st.isempty());
		System.out.println(st.isfull());
		System.out.println(st.pop());
		st.display();
		System.out.println(st.peek());
		st.display();
		
	}

}
