package lecture4;
import java.util.*;
public class fibonakeseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0 ;
		int b = 1 ;
		for(int  i = 1; i<=n; i++) {
			//System.out.println(a); to print the whole series 0,1,1,2,3,5,8
			int c = a+b;
			a = b;
			b = c;
		}
		System.out.println(a);

	}

}
// nth fibonacci number