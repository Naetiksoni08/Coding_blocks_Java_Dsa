package bitmasking;

import java.util.Scanner;

public class tavas_saddas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(INDEX(str));

	}
	public static int INDEX(String str) {
		int n = str.length();
		int count = (1<<n)-2; //  n-1 digit tk ke sare count aahgaya 
		int pos= 0;
		for(int i= n-1; i>=0; i--) {
			if(str.charAt(i)=='7') {
				count  = count + (1<<pos);
			}
			pos++;
			
		}
		return count+1;
	}

}
//code forces
