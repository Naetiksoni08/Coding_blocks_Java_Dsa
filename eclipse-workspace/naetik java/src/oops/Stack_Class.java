package oops;

public class Stack_Class {
	public class stack_Class implements stackI{

		@Override
		public void push(int item) {
			// TODO Auto-generated method stub
			System.out.println(stackI.x);
			
		}

		@Override
		public int pop() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int peak() {
			// TODO Auto-generated method stub
			return 0;
		}
		public static void main(String[]args) {
//			stackI s = new stackI();
			Stack_Class cs = new Stack_Class(); 
		}
		
	}

}
