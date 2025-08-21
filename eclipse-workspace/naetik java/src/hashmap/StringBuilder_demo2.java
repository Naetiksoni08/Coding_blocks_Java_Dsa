package hashmap;

public class StringBuilder_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String_Add();
		StringBuilder(); // it is more faster 
		

	}

	
	public static void String_Add() {
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s+i;
			
		}
		System.out.println("bye");

		}

	public static void StringBuilder() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		System.out.println("bye");

	}
//	string is slow and string builder is so fastt 

}
