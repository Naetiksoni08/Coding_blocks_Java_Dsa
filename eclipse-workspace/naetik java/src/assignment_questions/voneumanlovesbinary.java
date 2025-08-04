package assignment_questions;

import java.util.Scanner;

public class voneumanlovesbinary {

            public static void main(String[] args) {
            	Scanner sc=new Scanner(System.in);
				int t = sc.nextInt();
				
				while(t>0) {
					int n= sc.nextInt(); 
					int dec = 0; // decimal
					int p = 0;
					while(n!=0) {
						dec+=((n%10)*Math.pow(2,p));
						n=n/10;
						p++;
					}
					System.out.println(dec);
					t--;
					
					
				}
            	
				}
            
            
           }





