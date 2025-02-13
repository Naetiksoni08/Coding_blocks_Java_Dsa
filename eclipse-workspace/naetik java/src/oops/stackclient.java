package oops;

public class stackclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.peek());
		s.Display();
		s.push(50);
		s.Display();
		
	
		

	}

}
