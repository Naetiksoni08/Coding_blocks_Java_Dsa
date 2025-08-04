package lecture5;

public class funtion_demo_parameterised {

	public static void main(String[] args) {
		System.out.println("hey");
		int a  = 8;
		int b = 7;
		add(b,a);
		System.out.println("bye");
	}
	public static void add(int a, int b) {
		int c = a+b;
		sub(c,b);
		System.out.println(c);
	}
	public static void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
	}

}
