package assignment_questions;

import java.util.Scanner;

public class Book_allocation_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt(); // no of books
			int m  = sc.nextInt(); // no of student
			int [] pages = new int[n];
			for (int i = 0; i < pages.length; i++) {
				pages[i] = sc.nextInt();
			}
			System.out.println(book_allocation(pages,m));
			t--;
		}
		
	}
	public static int book_allocation(int []pages,int students) {
		int low = 0;
		int high = 0;
		int ans = 0;
	    for(int v: pages) {
	    	high+=v; // high is 203 now and lo is 0
	    	
	    }
	    while(low<=high) {
	    	int mid = (low+high)/2;
	    	if(isitpossible(pages,students,mid)==true) { // mid is right the limit we have set for pages read by a student
	    		ans = mid; // for now our mid is only our answer
	    		high = mid-1;
	    	}else {
	    		low = mid+1;
	    	}
	    }
	    return ans;
	}
	private static boolean isitpossible(int[] books, int nos, int mid) {
		 int student = 1;
		 int readbooks = 0; // initially that student has read 0 books
		 for (int i = 0; i < books.length;) { // why not i++ will tell you
			if(readbooks+books[i]<=mid) { // this means ki joh student 1 nai book read kari hai plus apna book of 1 that is 12 so 0+12 kya voh humare mid 101 sai kam hai yes
				readbooks+=books[i]; // toh add karde read books mai book of i yani 12 ko 
				i++; // if kam hai toh i++ kardo that means aur pages do isse 12+37
			}else {
				student++; // else student bada deh agar limit sai zada pages ho gaye toh mtlb s2 aah gaya
				readbooks= 0; // aur s2 ke liye bhi read books 0 sai intialize karde
			}
			if(student>nos) {  // agr kabhi yeh hua ki student joh hai badate badate nos sai zada hogaye toh return false
				return false;
			}
		}
		return true;
	}

}
