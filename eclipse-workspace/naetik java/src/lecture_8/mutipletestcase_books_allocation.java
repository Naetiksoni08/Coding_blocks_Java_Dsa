package lecture_8;

import java.util.Scanner;

public class mutipletestcase_books_allocation {

		public static void main(String[] args) {
			Scanner Sc = new Scanner(System.in);
			int t = Sc.nextInt();
		    while(t>0) {
		    	int nos = Sc.nextInt();
		    	int n= Sc.nextInt();
				int [] books = new int[n];
		    	for(int i = 0 ; i<books.length;i++) {
		    		books[i] = Sc.nextInt();
		    	}
			System.out.print( minimum_page_limit(books,nos));
			t--;
		    	
		    	}
		    }
		public static int minimum_page_limit(int[] books, int nos) {
			int lo = 0;
			int ans=0;
			int hi = 0;
			for(int v : books) { // for(int v: books) this is used to sum the total of the array
				hi= hi+v;
				
			}
			while(lo<=hi) {
				int mid = (lo+hi)/2;
				if(isitpossible(books,nos,mid)==true) {
					ans=mid;
					hi= mid-1;
					
					
				}else {
					lo=mid+1;
					
				}
			}
			return ans;
			
		}
		public static boolean isitpossible(int[] books, int nos, int mid) {
		    int student = 1;
		    int readpage = 0;
		    for(int i = 0 ; i < books.length;) {
		    	if(readpage+books[i] <=mid) {
		    		readpage = readpage + books[i];
		    		i++;
		    	}else {
		    		student++;
		    		readpage=0;
		    		
		    	}
		    	if(student>nos) {
		    		return false;
		    	}
		    	
		    }
		    return true;
		   
		}

	

	}


