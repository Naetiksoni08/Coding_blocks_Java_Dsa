package lecture3forndwhileloop;

import java.util.Scanner;

public class pattern28 {

	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in); 
	    	int n = sc.nextInt(); 
	        int row = 1; // Start with the first row

	        while (row <= n) {
	            int val = row; // Starting value for the current row
	            int num = 1; // Start number for each row

	            // Print leading spaces
	            int space = n - row;
	            while (space > 0) {
	                System.out.print("  ");
	                space--;
	            }

	            // Print increasing numbers
	            while (num <= row) {
	                System.out.print(val + " ");
	                val++;
	                num++;
	            }

	            // Prepare to print decreasing numbers
	            val = val - 2;
	            num = 1;

	            // Print decreasing numbers
	            while (num < row) {
	                System.out.print(val + " ");
	                val--;
	                num++;
	            }

	            // Move to the next row
	            System.out.println();
	            row++;
	        }
	    }
	}
	
	

	