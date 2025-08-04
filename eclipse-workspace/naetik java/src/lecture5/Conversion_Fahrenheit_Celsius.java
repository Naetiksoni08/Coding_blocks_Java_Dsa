package lecture5;

import java.util.Scanner;

public class Conversion_Fahrenheit_Celsius {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		 int minf = sc.nextInt();
		 int maxf = sc.nextInt();
		 int steps = sc.nextInt();
		      
		        for(int i = minf;i <= maxf; i= i  + steps ) {
		        	int c = (int) ((5.0 / 9) * (i - 32)); 
		        	System.out.println(i + "\t" + c);
		        }
			}

		//integer c = (5/9) * (i - 32); 
		//this will give 0 as output in each case in order to correct it we will do
		//we want the answer in integer so we will do type casting by doing this	
		//int c = (int) ((5.0 / 9) * (i - 32)); 
		// and why we wrote 5.0 just to make it as double double ko integer se divide kia toh always big value will come

	}

