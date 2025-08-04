package lecture3forndwhileloop;

public class pattern33 {

		    public static void main(String[] args) {
		        int n = 10; // Total number of rows
		        int row = 1; // Starting row

		        // Outer loop for rows
		        while (row <= n) {
		            // Print leading spaces
		            int spaces = n - row;
		            while (spaces > 0) {
		                System.out.print("   "); // Three spaces for alignment
		                spaces--;
		            }

		            // Print increasing numbers from the current row to 9
		            int num = row;
		            while (num <= 9) {
		                System.out.print(num + "  ");
		                num++;
		            }

		            // Print the middle zero with a space before
		            System.out.print("0 "); 

		            // Print decreasing numbers from 9 back to the current row
		            num = 9;
		            while (num >= row) {
		                System.out.print(num + "  ");
		                num--;
		            }

		            // Move to the next line after finishing the current row
		            System.out.println();
		            row++;
		        }
		    }
	}
