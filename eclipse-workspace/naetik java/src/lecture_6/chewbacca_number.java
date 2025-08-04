package lecture_6;

import java.util.*;
public class chewbacca_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n  = sc.nextInt();
		System.out.println(chewbacca_number(n));

	}
	public static int chewbacca_number (int n) {
		int num2= 0;
		int place =1;
		while(n>0) {
			int t = n%10;
			int num = 9 - t;
			if(t>num && (num!=0 || n/10 !=0)) {
				t=num;
			}
			num2 = num2+(t*place);
			place = place*10;
			n = n/10;
	
				
			}
		return num2;
		
		}
	
}

