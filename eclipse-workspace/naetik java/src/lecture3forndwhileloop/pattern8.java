package lecture3forndwhileloop;

public class pattern8 {

	public static void main(String[] args) {
		int n = 5; // size of the pattern (must be odd for a perfect cross)
        int i = 0; // row counter

        while (i < n) {
            int j = 0; // column counter
            while (j < n) {
                // Print '*' on the main diagonal (i == j) and the anti-diagonal (i + j == n - 1)
                System.out.print((i == j || i + j == n - 1) ? "* " : "  ");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }
  

	}

}
