package lecture3forndwhileloop;

import java.util.Scanner;

public class laddernumber {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); 
	        int n = sc.nextInt(); // Read the number of rows
	        int currentnumber = 1;
	        int row = 1;
	        while(row <= n) {
	        	int num = 1;
	        	while(num <= row) {
	        		System.out.print(currentnumber + "  ");
	        		currentnumber++;
	        		num++;
	        		
	        	}
	        	System.out.println();
	        	row++;
	        
	        	
	        }
	
	    }
}