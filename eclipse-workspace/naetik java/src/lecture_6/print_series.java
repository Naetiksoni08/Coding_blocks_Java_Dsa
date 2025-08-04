package lecture_6;

import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1= sc.nextInt();
		int N2= sc.nextInt();
		print_series(N1,N2);

	}
	public static void print_series(int N1,int N2) {
		int count = 0;
		int n = 1;
		
		while(count<N1) {
			int term = 3 * n + 2;
			
			
			if(term % N2 != 0) {
				System.out.println(term);
				count++;
			}
			n++;
			
		}
	}

}
