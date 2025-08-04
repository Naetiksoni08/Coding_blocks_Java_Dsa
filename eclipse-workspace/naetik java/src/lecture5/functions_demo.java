package lecture5;

public class functions_demo {

	public static void main(String[] args) {
		System.out.println("hey");
		naetik(); // call down function Naetik() // CALL THE FUNCTION
		System.out.println("bye");
	} // VOID DOESNT RETURN ANYTHING 
	public static void naetik() {
		int a  = 8;
		int b  =7;
		int c = a+b;
		sub();//why 15 wont come before 1 because we called a new function sub
		// before printing naetik function 
		System.out.println(c);
	}
	public static void sub() {
		int a  = 8 ;
		int b = 7;
		int c = a-b;
		System.out.println(c);
	}
}
