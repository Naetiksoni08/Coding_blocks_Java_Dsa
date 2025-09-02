package assignment_questions;

import java.util.Scanner;

public class Alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int [] price = new int[n];
		 for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		 int query = sc.nextInt(); // query
		 while(query>0) {
			 int amount = sc.nextInt();
			 int k = sc.nextInt();
			 
			 isshopkeepercorrect(price,amount,k);
			 if(isshopkeepercorrect(price,amount,k)) {
				 System.out.println("Yes");
			 }else {
				 System.out.println("No");
			 }
			 query--;
			
		 }
		
		 
		
		
		
			

	}
	 public static boolean isshopkeepercorrect(int [] price,int amount,int k) {
		 int count = 0;
			for (int i = 0; i < price.length; i++) {
				if(amount%price[i]==0) { // if joh price ka array ka say 1st element hai 100 aur amount uske pass bhi 100 hai aur k = 2 toh 100%100 = 0 
//					aur agar aisa hota hai toh count++ kardo end mai yeh check karlo ki return tabhi karna jab count ki value k yani 2 sai zada ya equal ho 
					count++;
				}
				
			}
			return count>=k; // return kardo agar count joh hai voh k sai zayada hai mtlb yes
	}


}
