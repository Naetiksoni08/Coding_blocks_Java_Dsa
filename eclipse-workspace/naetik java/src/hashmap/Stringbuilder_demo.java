package hashmap;

public class Stringbuilder_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it is mutable
		StringBuilder sb = new StringBuilder(); // it is more fast than string 
		System.out.println(sb.capacity());//by default the capacity is 16 but if u add hello than hello + capacity so 21
		sb.append(false);
		sb.append(true);
		sb.append("raj");
		sb.append('a');
		sb.append(10);
		sb.append("bye");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(1)); // character fetch
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1,3));
		String s = sb.toString(); // integer se String mai convert
		//old capacity *2+2 it grows with this 
		
		
		

	}

}
