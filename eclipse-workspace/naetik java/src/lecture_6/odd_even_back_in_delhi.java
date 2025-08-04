package lecture_6;
import java.util.*;

public class odd_even_back_in_delhi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 2 times
		while(t>0) {
		int carno = sc.nextInt();
		if(odd_even_back_in_delhi(carno)==true) {
			System.out.println("Yes");	
		} else {
			System.out.println("No");
		}
		t--;
	}	

}
	public static boolean odd_even_back_in_delhi(int n) {
		int sumeven = 0;
		int sumodd = 0 ;
		while(n>0) {
			int rem = n%10;
			if(rem%2==0) {
				sumeven = sumeven+rem;	
			} else {
				sumodd = sumodd+rem; // sumodd+=rem
			}
			n = n/10;
		}
		if(sumeven%4==0|| sumodd%3==0) {
			return true;
			
		}else {
			return false;
		}
		
	}
	

}
