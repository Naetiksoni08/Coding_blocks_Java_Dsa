package lecture2;

public class maximumof3numbers {

	public static void main(String[] args) {
		int a, b ,c;
		a = 14;
		b = 4;
		c = 5;
		if(a>b && a>c) {
			System.out.println("the maximum number is : " +a);
			
		}
		else if(b>a && b>c) {
			System.out.println("the maximum number is : " +b);
			
		}
		
		else {
			System.out.println("the maximum number is : " +c);
		}

	}

}
