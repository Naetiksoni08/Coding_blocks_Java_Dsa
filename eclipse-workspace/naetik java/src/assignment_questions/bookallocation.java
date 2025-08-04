package assignment_questions;

public class bookallocation {

	public static void main(String[] args) {
		int[] book = { 10, 20, 30, 40 };
		int nos = 2;
		System.out.println(books(book,nos));
	}

	public static int books(int[] book, int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for (int v : book) {
			hi += v;
			

		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(book, nos, mid) == true) {
				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;
			}

		}
		return ans;

	}

	public static boolean isitpossible(int[] book, int nos, int mid) {
		int student = 1;
		int readbook = 0;
		for (int i = 0; i< book.length;) {
			if(readbook+book[i]<=mid) {
				readbook+=book[i];
				i++;
			}else {
				student++;
				readbook=0;
				
			}
			if(student>nos) {
				return false;
			}

		}

		return true;
	}

}
