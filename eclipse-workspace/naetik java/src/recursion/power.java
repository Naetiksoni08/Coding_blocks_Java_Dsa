package recursion;

public class power {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println(print(a,b));
	}
	public static int print(int a , int b) {
		//base case
		if(b==0) {
			return 1; // b reduce hote hote aisa na ho ki 0 ho jaye that is why 
		}
		int ans = print(a,b-1);
				return ans * a;
	
	}
}
