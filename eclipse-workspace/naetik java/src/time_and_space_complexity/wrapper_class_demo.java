package time_and_space_complexity;

public class wrapper_class_demo {

	public static void main(String[] args) {
		int a = 9;//  primitive 
		Integer a1 = 91; // non primitive // content will be printed
		System.out.println(a);
		System.out.println(a1);
		//auto-boxing
		// ek primitive data ko uske corresponding wala non primitive mai rakhte h usko auto boxing kehete h 
		// un-boxing 
		// jab ek non primitive data ko primitive par rakhte h 
		//
		a1 = a; // auto-boxing ek primitive data ko non primitive data mai assign karna
		int b = 11;
		Integer b1 = 111;
		System.out.println(b);
		System.out.println(b1);
		// un-boxing 
		// non primitive data ko primitive mai assign karna
		b = b1;
		
		Integer c1 = 18;// refer to copy 
		Integer c2 = 18;// refer to copy 
		Integer c3 = 189; // refer to copy 
		Integer c4 = 189;  // refer to copy 
		System.out.println(c1 == c2); // == compares the address of the c1 = c2
		System.out.println(c3 == c4);
		
		
		
		
		

	}

}
