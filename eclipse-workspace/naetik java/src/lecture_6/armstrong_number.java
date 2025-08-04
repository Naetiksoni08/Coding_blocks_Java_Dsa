package lecture_6;
import java.util.*;

public class armstrong_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
	    System.out.println(armstrong_number(n));

	} 
	public static boolean armstrong_number(int n) {
		int c =countofdigit(n);// first we have to check the how many number are there in the number so count of digit will tell us
		int sum = 0;
		int p = n;
		while(n>0) {
			int rem = n%10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
			
			
		}
		if(sum==p) {     // it is giving wrong why because 371 37 3 after this 3 becomes  0
			// that is n = 0 so when we come at if(sum==n) we are checking with sum==0 which is wrong 
			//1 power 3 + 7 power 3 + 3 power 3 = 371 if 371==number which is 371 then true but here it is 0 that is why it is wrong
			// so n ko kahi yaad karlete h 
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static int countofdigit(int n) {
	   int count = 0; 
	   while(n>0) {
		   count++;
		   n = n /10;
		   
	   }
	   return count;
	
	}

}
