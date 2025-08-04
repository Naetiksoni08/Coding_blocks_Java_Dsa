package lecture_8;

public class book_allocation {

	public static void main(String[] args) {
		int [] books = {10,20,30,40};
		int nos =2;
		System.out.println( minimum_page_limit(books,nos));

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
