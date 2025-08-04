package lecture3forndwhileloop;

public class pattern29 {
	    public static void main(String[] args) {
	        int n = 5; // Number of rows
	        int row = 1; // Start with the first row

	        while (row <= n) {
	            // Print leading spaces
	            int space = n - row;
	            while (space > 0) {
	                System.out.print("  ");
	                space--;
	            }

	            // Print the first number of the row
	            System.out.print(row + " ");

	            // Calculate the number of zeros to print
	            int zeroCount = (row - 1) * 2 - 1; // Number of zeros in the middle

	            // Print zeros
	            while (zeroCount > 0) {
	                System.out.print("0 "); // Space after each zero
	                zeroCount--;
	            }

	            // Print the last number of the row (if row > 1)
	            if (row > 1) {
	                System.out.print(row + " ");
	            }

	            // Move to the next line
	            System.out.println();
	            row++;
	        }
	    }
	}

