package strings;

public class string_to_integer {

	public static void main(String[] args) {
	   String s = "6779879";
	   int x = Integer.parseInt(s); 
	   System.out.println(x);
	   String s1 = "6779877689999"; //value is bigger than 10 ki power 9 so we will convert it in long
	   long l = Long.parseLong(s1);
	   System.out.println(s1);
         
	}

}
