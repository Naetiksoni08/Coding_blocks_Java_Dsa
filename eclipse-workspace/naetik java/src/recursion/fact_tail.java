package recursion;

public class fact_tail {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n ,1)); // answer starts from 1 because we are taking product not sum 
		

	}
	public static int factorial(int n ,int ans) {
		//base case 
		if(n==0) {
			return ans; 
		}
		
      return factorial(n-1,ans*n); // 4,4*5 then 3,3*5 and so on 
	}
	
	//return factorial(n-1) * n; //  this is still called head recursion because we are still printing something


}
