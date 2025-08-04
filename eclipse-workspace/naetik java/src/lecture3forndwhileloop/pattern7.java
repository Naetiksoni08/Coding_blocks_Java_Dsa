package lecture3forndwhileloop;

public class pattern7 {

	public static void main(String[] args) {
		 int n = 5; // size of the square
	        int i = 0; // row counter

	        while (i < n) {
	            int j = 0; // column counter
	            while (j < n) {
	                // Print '*' on boundary positions (first/last row and first/last column)
	                System.out.print((i == 0 || i == n - 1 || j == 0 || j == n - 1) ? "* " : "  ");
	                j++;
	            }
	            System.out.println(); // Move to the next line after each row
	            i++;
	        }

	}

}
