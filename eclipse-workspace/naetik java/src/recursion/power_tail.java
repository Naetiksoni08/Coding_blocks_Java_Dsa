package recursion;

public class power_tail {

	public static void main(String[] args) {
	
			int a = 3;
			int b = 5;
			System.out.println(print(a,b,1));
		}
		public static int print(int a , int b, int ans) {
			//base case
			if(b==0) {
				return ans; 
			}	
				return print(a,b-1,ans*a);
				
//			int ans = print(a,b-1);
//					return ans * a;
		
	

	}

}
