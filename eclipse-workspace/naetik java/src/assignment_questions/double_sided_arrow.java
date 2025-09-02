package assignment_questions;

import java.util.*;

public class double_sided_arrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		 if (N % 2 == 0) {
	            return; 
	        }
		int startSpaces = N;
		int secondSpaces = -1;

		int row = 1;
		while (row <= N) {
			int innerSpaces = 1;
			while (innerSpaces <= startSpaces) {
				System.out.print("  ");
				innerSpaces++;
			}
			// numbers
			int innerNumber;
			int endNumbers;
			if (row <= N / 2 + 1) {
				innerNumber = row;
				endNumbers = row;
			} else {
				innerNumber = N - row + 1;
				endNumbers = N - row + 1;
			}
			while (innerNumber >= 1) {
				System.out.print(innerNumber + " ");
				innerNumber--;
			}

			// print middle spaces.
			int middleSpacePrint = 1;
			while (middleSpacePrint <= secondSpaces) {
				System.out.print("  ");
				middleSpacePrint++;
			}
			// print end Numbers
			int printEndNumbers = 1;
			if (row == 1 || row == N) {
				printEndNumbers = 2;
			}
			while (printEndNumbers <= endNumbers) {
				System.out.print(printEndNumbers + " ");
				printEndNumbers++;
			}
			if (row <= N / 2) {
				secondSpaces += 2;
				startSpaces -= 2;
			} else {
				secondSpaces -= 2;
				startSpaces += 2;
			}
			row++;
			System.out.println();
		}

	}

}



// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int middle = n / 2 + 1; // middle row 4 
//int count;
//
//for (int r = 1; r <= n; r++) { // 1 sai 7tk 
//	if (r <= middle) { // 1 < = 4
//		count = r; // expanding the row 1,2,3,4
//	} else {
//		count = n - r + 1; // shrinking the row 3,2,1 for example 7-5+1 = 3
//
//	}
//	// left side pattern
//	for (int i = count; i >= 1; i--) { // why not middle cuz middle is fixed then the pattern wont get printed in the right form
//		System.out.print(i + " ");
//
//	}
////	spaces
//	int spaces = n - 2 * count + 1;
//	for (int i = 1; i <=spaces; i++) {
//		System.out.print("  ");
//
//	}
//
//	// right side pattern
//	for (int i = 1; i <= count; i++) {
//		System.out.print(i + " ");
//
//	}
//	System.out.println();
//
//}
//
//}
//
//}

