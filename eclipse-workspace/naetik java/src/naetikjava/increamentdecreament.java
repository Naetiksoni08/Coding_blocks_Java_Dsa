package naetikjava;

public class increamentdecreament {

	public static void main(String[] args) {
		int x = 8;
		System.out.println(x++);
		System.out.println(x);
		//post increase 
		int a = x++ + x-- + 7 - x++;
		System.out.println(a);//16

	}

}
