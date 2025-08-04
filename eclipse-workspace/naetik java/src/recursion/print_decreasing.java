package recursion;

public class print_decreasing {

	public static void main(String[] args) {
		int n = 5;
		print(n);
		
				

	}
	public static void print(int n) {
		if(n == 0) {
			return; // when return type is void we right return;
			
			
		}
		System.out.println(n); // print 5
		print(n-1); // 4 3 2 1 printed by recursion 
	}

}
