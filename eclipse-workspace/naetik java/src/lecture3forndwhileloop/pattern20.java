package lecture3forndwhileloop;

public class pattern20 {

	public static void main(String[] args) {
	    int n = 5; // size of the diamond (controls half height)
        int i = 1; // row counter

        // Top half of the diamond
        while (i <= n) {
            int j = 1;
            // Print leading spaces
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            // Print stars and spaces inside the diamond
            j = 1;
            while (j <= 2 * i - 1) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(); // Move to the next line
            i++;
        }

        // Bottom half of the diamond
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            // Print leading spaces
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            // Print stars and spaces inside the diamond
            j = 1;
            while (j <= 2 * i - 1) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(); // Move to the next line
            i--;
        }
   

	}

}
