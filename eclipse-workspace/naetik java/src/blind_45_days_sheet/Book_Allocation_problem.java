package blind_45_days_sheet;

import java.util.Scanner;

public class Book_Allocation_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt(); // no of books
		int nos = sc.nextInt(); // no of students
		int[] books = new int[n];
		for (int i = 0; i < books.length; i++) {
			books[i] = sc.nextInt();
		}
		System.out.println(Book_Allocation(books, nos));

	}

	public static int Book_Allocation(int[] books, int student) {
		int low = 0;
		int high = 0;
		int ans = 0;
		for (int v : books) {
			high += v;
		}
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isitpossible(books, student, mid) == true) { // books no of students and the limit on pages a student
						  									// can read
				ans = mid;
				high = mid - 1; // agar mai itne students ke sath itni limit ke sath aur itni no of pages ke
								// sath true la pa raha hu toh then change high minimum nikal lo
			} else {
				low = mid + 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] books, int nos, int mid) {
		int student = 1;
		int readpage = 0;
		for (int i = 0; i < books.length;) {
			if (books[i] + readpage <= mid) {
				readpage += books[i];
				i++;

			} else {
				student++;
				readpage = 0;
			}
			if (student > nos) {
				return false;
			}
		}

		return true;
	}

}
// we are changing high here cuz we need to minimize in aggressive cow we need to find maximum so we were changing low
