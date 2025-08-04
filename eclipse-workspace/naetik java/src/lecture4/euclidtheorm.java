package lecture4;

public class euclidtheorm {

	public static void main(String[] args) {
		int sum = 0;
		int n = 3789;
		while(n>0) {
			int rem = n % 10;
			sum = sum + rem;
			n/=10;//n=n/10
		}
		System.out.println(sum);

	}

}
