package recursion_backtracking_bitmasking_practice;

public class recrusion_fibo {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(fibo(n));
		

	}
	public static int fibo(int n) {
		if(n==0 || n==1) {
           return n; 	
		}
		int f1 = fibo(n-1);
		int f2 =  fibo(n-2);
		return f1+f2;
		
		
		
	}
	

}
