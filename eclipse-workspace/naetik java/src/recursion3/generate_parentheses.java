package recursion3;
import java.util.*;

public class generate_parentheses {

	public static void main(String[] args) {
		int n = 3;
		List<String> ll =new ArrayList<>();
		generate_parenthes(n,0,0,"",ll); 
		System.out.println(ll);

	}
	public static void generate_parenthes(int n, int open,int close, String ans,List<String> ll) {
		if(open==n && close==n) {
//			System.out.println(ans+" ");
			ll.add(ans); // adding the answer into the list 
		    return;
		}
		
		
		if(open<n) { // open>n || close>open
			//return and remove both the condition for the recursive calls
		generate_parenthes(n,open+1,close,ans+"(" , ll); // if first call is of open bracket 
	}

		if(close<open) {
		generate_parenthes(n,open,close+1,ans+")" , ll); 
	}
  }
}


