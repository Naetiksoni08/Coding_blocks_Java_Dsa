package lecture4;

public class decimal_to_binary {

	public static void main(String[] args) {
		int n = 87;
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%2;
			sum = sum + rem * mul;
			mul = mul *10;
			n = n/2;
		}
		System.out.println(sum);

	}

}
// 6 to 10 
//while(n>0) {
	//int rem = n%2;
	//sum = sum + rem * mul;
	//mul = mul *6;
	//n = n/10;
//}
//System.out.println(sum);


