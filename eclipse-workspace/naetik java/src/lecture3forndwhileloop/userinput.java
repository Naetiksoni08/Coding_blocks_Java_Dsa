package lecture3forndwhileloop;

import java.util.*; // u can take scanner too but it is a specific library

public class userinput {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in); // capital s
//		int n = sc.nextInt(); // sc is a variable u can take anything
//		System.out.println(n);
//		int a = sc.nextInt();
//		System.out.println(a);

		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int step = sc.nextInt();
		for (int i = minf; i <= maxf; i += step) {
			int c = (int) ((5 / 9.0) * (i - 32));
			System.out.print(i + "\t" + c);

		}

	}

}
