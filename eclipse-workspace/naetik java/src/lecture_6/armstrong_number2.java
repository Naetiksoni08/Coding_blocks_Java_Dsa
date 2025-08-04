package lecture_6;

import java.util.Scanner;

public class armstrong_number2 {

	public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				int n1 = sc.nextInt();
				int n2= sc.nextInt();
				for(int n = n1 ; n<=n2;n++) {
					 if(armstrong_number(n)) {
						 System.out.println(n);
					 }
				} 
			    

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
	            	if(sum==p) {     
	        			return true;
	        		}
	            	return false;
	        		
	            
				
				
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
