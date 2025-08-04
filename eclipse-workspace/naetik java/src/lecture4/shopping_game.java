package lecture4;

import java.util.Scanner;

public class shopping_game {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int t = sc.nextInt();
		while(t>0) {	
			int m = sc.nextInt();//ayush
			int n = sc.nextInt();//harshit
		int a = 0; 
		int h = 0;
		int phone  = 1;
		while(true) { // run a infinite loop write like this
			a+=phone;// add a a phone u got 1 phone 
			if(a>m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			h+=phone;// add a a phone u got 1 phone 
			if(h>n) {
				System.out.println("Aayush");
				break;
				}
			phone++;
		}
		t--;

	}

  }
}