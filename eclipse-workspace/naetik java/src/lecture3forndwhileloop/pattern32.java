package lecture3forndwhileloop;

public class pattern32 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while(row<=n) {
			int num =1;
		while(num<=row) {
			System.out.print(row);
		if(num<row) {
			System.out.print(" * ");
		}
		num++;
	}
		System.out.println();
		row++;
}
      row = n-1;
      while (row >= 1) {
          int num = 1; // Number counter
          while (num <= row) {
              System.out.print(row); // Print the row number
              if (num < row) {
                  System.out.print(" * "); // Print an asterisk except after the last number
              }
              num++;
          }
          System.out.println(); // Move to the next line
          row--;
      }
	}

}
