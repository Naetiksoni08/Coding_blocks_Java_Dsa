package strings;

public class strings_demo {

	public static void main(String[] args) {
		String s1 = "hello";//1st method of making string
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		s1 =  s1+"bye"; // st.concat("bye);
		String s5 = "hello"+"bye"; // and this is the second method if aise nai likha toh outside the pool bana hoga string 
		System.out.println(s5);
		//same location par change nai hota string//immutable string means this only 
		
		

	}

}
