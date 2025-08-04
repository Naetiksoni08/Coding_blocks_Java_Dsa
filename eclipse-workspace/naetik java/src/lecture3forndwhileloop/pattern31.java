package lecture3forndwhileloop;

public class pattern31 {

	public static void main(String[] args) {

	        int n = 5; // Number of rows
	        int row = 1; // Start with the first row

	        while (row <= n) {
	            int num = 5; // Start with 5 for each row
	            int col = 1; // Column counter
	            
	            while (col <= n) {
	                // Check if we need to print an asterisk
	                if (col == (n - row + 1)) {
	                    System.out.print("* "); // Print asterisk in the correct position
	                } else {
	                    System.out.print(num + " "); // Print the number
	                }
	                num--; // Decrement the number
	                col++; // Move to the next column
	            }

	            // Move to the next line after each row
	            System.out.println();
	            row++; // Increment the row count
	        }

	}

}
